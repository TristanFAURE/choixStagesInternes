package org.coordipsy.prechoice.prechoice.presentation;

import java.util.Comparator;

import org.coordipsy.prechoice.prechoice.Interne;

public class InterneComparator implements Comparator<Interne> {

	public int compare(Interne interne1, Interne interne2) {
		Integer promo1 = interne1.getPromotion() ;
		Integer promo2 = interne2.getPromotion() ;
		int result = promo1.compareTo(promo2);
		if (result == 0){
			Integer classement1 = interne1.getClassement();
			Integer classement2 = interne2.getClassement();
			result = classement1.compareTo(classement2);
		}
		return result;
	}

}
