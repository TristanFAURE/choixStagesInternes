package org.coordipsy.prechoice.prechoice.generators;

import java.util.Collections;
import java.util.List;

import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.presentation.InterneComparator;
import org.coordipsy.prechoice.prechoice.presentation.PrechoiceEditorPlugin;
import org.coordipsy.prechoice.prechoice.utils.GetAll;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class AffectationDInternes {
	private final PreChoix preChoix;

	public AffectationDInternes (PreChoix preChoix){
		this.preChoix = preChoix;
	}
	
	public Command process (EditingDomain domain){
		CompoundCommand result = new CompoundCommand();
		List<Interne> allInternes = new GetAll(Interne.class).getAll(preChoix);
		StringBuffer errors = new StringBuffer();
		Collections.sort(allInternes, new InterneComparator());
		// the internes are sorted we can do the assigments
		boolean error = false ;
		for (Interne i : allInternes){
			result.appendAndExecute(new SetCommand(domain, i,PrechoicePackage.Literals.INTERNE__AFFECTATION ,null));
		}
		for (Interne i : allInternes){
			boolean found = false ;
//			if (error){
//				result.appendAndExecute(new SetCommand(domain, i,PrechoicePackage.Literals.INTERNE__AFFECTATION ,null));
////				i.setAffectation(s);
//			}
//			else {
				for (Stage s : i.getChoix()){
					if (s.getInterneAffecte() != null && s.getInterneAffecte().size() < s.getNombreDePostes()){
						result.appendAndExecute(new SetCommand(domain, i,PrechoicePackage.Literals.INTERNE__AFFECTATION ,s));
//						i.setAffectation(s);
						found = true;
						break;
					}
					
				}
				if (!found && i.getChoix().size() > 0){
					errors.append(i.getNom() + " " + i.getPrenom() + "\n");
					for (Stage s : i.getChoix()){
						errors.append("\t" + s.getNom()) ;
						for (Interne i2 : s.getInterneAffecte()){
							errors.append("\n\t\t" + i2.getNom() + " " + i2.getPrenom() + ",");
						}
						errors.append("\n");
					}
					errors.append("\n");
				}
//			}
		}
		if (errors.length() > 0){
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "These interns have problem : " + errors.toString());
			PrechoiceEditorPlugin.getPlugin().getLog().log(new Status(Status.INFO, "org.oordipsy", errors.toString()));
		}
		return result ;
	}
	
	
}
