package org.coordipsy.prechoice.prechoice.utils;

import java.util.LinkedList;
import java.util.List;

import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.ElementNomme;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.Stage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public final class Utils {
	public static Color PREMIER_CHOIX = Display.getDefault().getSystemColor(
			SWT.COLOR_GREEN);
	public static Color DEUXIEME_CHOIX = Display.getDefault().getSystemColor(
			SWT.COLOR_DARK_GREEN);
	public static Color TROISIEME_CHOIX = Display.getDefault().getSystemColor(
			SWT.COLOR_YELLOW);
	public static Color QUATRIEME_CHOIX = Display.getDefault().getSystemColor(
			SWT.COLOR_RED);
	public static Color CINQUIEME_CHOIX = Display.getDefault().getSystemColor(
			SWT.COLOR_DARK_RED);

	public static boolean hasOneStage(Dossier d) {
		for (ElementNomme e : d.getElements()) {
			if (e instanceof Stage) {
				return true;
			} else if (e instanceof Dossier) {
				Dossier dossier = (Dossier) e;
				return hasOneStage(dossier);
			}
		}

		return false;
	}

	public static int getNbStages(Dossier d) {
		int nb = 0;
		for (ElementNomme e : d.getElements()) {
			if (e instanceof Stage) {
				nb++;
			} else if (e instanceof Dossier) {
				nb += getNbStages((Dossier) e);
			}
		}
		return nb;
	}

	public static List<Dossier> getAllParents(Stage stage) {
		LinkedList<Dossier> result = new LinkedList<Dossier>();
		EObject container = stage.eContainer();
		while (container instanceof Dossier && !(container instanceof PreChoix)) {
			result.addFirst((Dossier) container);
			container = container.eContainer();
		}
		return result;
	}

	public static Color getColor(Interne interne) {

		int nbChoix = getNbChoice(interne);
		switch (nbChoix) {
		case 0:
			return PREMIER_CHOIX;
		case 1:
			return DEUXIEME_CHOIX;
		case 2:
			return TROISIEME_CHOIX;
		case 3:
			return QUATRIEME_CHOIX;
		case 4:
			return CINQUIEME_CHOIX;
		default:
			break;
		}
		return null;
	}

	public static String getRGB(Color color) {
		int iRgb = ((color.getRed() & 0xFF) << 16)
				| ((color.getGreen() & 0xFF) << 8)
				| ((color.getBlue() & 0xFF) << 0);
		String hexString = Integer.toHexString(iRgb);
		while (hexString.length() < 6) {
			hexString = "0" + hexString;
		}
		return hexString;
	}

	public static int getNbChoice(Interne i) {
		Stage s = i.getAffectation();
		if (s != null){
			return i.getChoix().indexOf(s);
		}
		return -1;
	}
	
	public static String getInterneName (Interne interne){
		return interne.getNom() + " " + interne.getPrenom();
	}

}
