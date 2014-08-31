package org.coordipsy.prechoice.prechoice.generators;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.ElementNomme;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.Localisation;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.utils.Utils;

public class HTMLGenerator {
	public String generate (PreChoix p){
		StringBuilder builder = new StringBuilder();
		int level = 0 ;
		append(builder,"<!-- DEBUT DU CODE A COPIER -->",level);
		append(builder,"<table border=\"1\">",level);
//			append(builder,"<tr>",level + 1);
//				append(builder,"<td>",level + 2);
//					append(builder,"Type",level + 3);
//				append(builder,"</td>",level + 2);
//				append(builder,"<td>",level +2);
//					append(builder,"Sites",level +3);
//				append(builder,"</td>",level + 2);
//				append(builder,"<td>",level + 2);
//					append(builder,"Services",level + 3);
//				append(builder,"</td>",level + 2);
//				append(builder,"<td>",level + 2);
//					append(builder,"Nb de Postes",level + 3);
//				append(builder,"</td>",level + 2);
//				append(builder,"<td>",level + 2);
//					append(builder,"Internes",level + 3);
//				append(builder,"</td>",level + 2);
//			append(builder,"</tr>",level + 1);
			
		generate(p, builder, level + 1);
		append(builder,"</table>",level);
		append(builder,"<!-- FIN DU CODE A COPIER -->",level);
		return builder.toString();
	}

	Set<Dossier> already = new HashSet<Dossier>();
	private void generate(Dossier d, StringBuilder builder, int level) {
		for (ElementNomme tmp : d.getElements())
		{
			if (tmp instanceof Dossier) {
				Dossier d2 = (Dossier) tmp;
				if (Utils.hasOneStage(d2)){
					generate(d2,builder,level+2);
				}
				for (ElementNomme e : d2.getElements()){
					if (e instanceof Stage) {
						Stage stage = (Stage) e;
						append(builder, "<tr>", level+1);
							List<Dossier> parents = Utils.getAllParents(stage);
						for (Dossier p : parents){
							if (!already.contains(p)){
								append(builder, String.format("<td rowspan=\"%d\"> ",Utils.getNbStages(p)), level+1);
								append(builder, p.getNom(), level+1);
								append(builder, "</td>", level+1);
								already.add(p);
							}
						}
						append(builder, "<td>", level+1);
						append(builder, stage.getNom(), level+3);
						append(builder, "</td>", level+1);
						append(builder, "<td>", level + 1);
						append(builder, String.valueOf(stage.getNombreDePostes()), level + 2);
						append(builder, "</td>", level + 1);
						append(builder, "<td>", level + 1);
						if (stage.getInterneAffecte().size() > 0)
						{
							append(builder, "<ul>", level+ 2);
							for (Interne i : stage.getInterneAffecte()){
								append(builder, String.format("<li>%s %s</li>",i.getNom(), i.getPrenom()), level+ 3);
							}
							append(builder, "</ul>", level + 2);
						}
						append(builder, "</td>", level + 1);
						append(builder, "</tr>", level);
					}
				}
				
			}
		}
	}

	private Object getNB(List<Stage> stages) {
		int cpt = 0 ;
		for (Localisation l : Localisation.values())
		{
			List<Stage> loc = getAllLocalisation(stages, l);
			if (loc.size() == 0)
			{
				cpt ++;
			}
			else
			{
				cpt += loc.size();
			}
		}
		return cpt;
	}

	private void getLocalisations(StringBuilder builder, List<Stage> stages, int level, String topCategory) {
		boolean flagAdultePedo = false ;
		Object nb = getNB(stages);
		
		for (Localisation l : Localisation.values()){
			List<Stage> stagesLocalises = getAllLocalisation(stages, l);
			
			int size = stagesLocalises.size();
			if (size > 0)
			{
				boolean flagCategorie = false ;
				for (Stage s : stagesLocalises)
				{
					append(builder, "<tr>", level);
					if (!flagAdultePedo)
					{
						flagAdultePedo = true ;
						append(builder, String.format("<td rowspan =\"%d\">",nb), level + 1);
						append(builder, topCategory, level + 2);
						append(builder, "</td>", level + 1);
					}
					if (!flagCategorie)
					{
						flagCategorie = true ;
						append(builder, String.format("<td rowspan =\"%d\">",size), level + 1);
						append(builder, l.getLiteral(), level + 2);
						append(builder, "</td>", level + 1);
					}
					append(builder, "<td>", level + 2);
					append(builder, s.getNom(), level + 3);
					append(builder, "</td>", level + 2);
					append(builder, "<td>", level + 2);
					append(builder, String.valueOf(s.getNombreDePostes()), level + 3);
					append(builder, "</td>", level + 2);
					append(builder, "<td>", level + 2);
					if (s.getInterneAffecte().size() > 0)
					{
						append(builder, "<ul>", level+ 3);
						for (Interne i : s.getInterneAffecte()){
							append(builder, String.format("<li>%s %s</li>",i.getNom(), i.getPrenom()), level+ 4);
						}
						append(builder, "</ul>", level + 3);
					}
					append(builder, "</td>", level + 2);
					append(builder, "</tr>", level);
				}
			}
			else
			{
				// size == 0
				append(builder, "<tr>", level);
				if (!flagAdultePedo)
				{
					flagAdultePedo = true ;
					append(builder, String.format("<td rowspan =\"%d\">",nb), level + 1);
					append(builder, topCategory, level + 2);
					append(builder, "</td>", level + 1);
				}
				append(builder, "<td>", level + 1);
				append(builder, l.getLiteral(), level + 2);
				append(builder, "</td>", level + 1);
				append(builder, "<td></td><td></td><td></td>", level + 1);
				append(builder, "</tr>", level);
			}
		}
	}

	private List<Stage> getAllLocalisation(List<Stage> stages, Localisation l) {
		List<Stage> result = new LinkedList<Stage>();
		for (Stage s : stages){
//			if (s.getLocalisation() == l){
				result.add(s);
//			}
		}
		return result;
	}

	public void append(StringBuilder builder, String s, int nbTab) {
		for (int i = 0 ; i < nbTab ; i++)
		{
			builder.append("\t");
		}
		builder.append(s);
		builder.append(System.getProperty("line.separator"));
	}

}
