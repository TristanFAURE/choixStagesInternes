package org.coordipsy.prechoice.prechoice.utils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.coordipsy.prechoice.prechoice.PreChoix;
import org.eclipse.emf.ecore.EObject;

public class GetAll<T> {

	private final Class<T> aClass;
	
	public GetAll (Class<T> aClass){
		this.aClass = aClass;
	}

	public List<T> getAll (PreChoix preChoix){
		List<T> result = new LinkedList<T>();
		for (Iterator<EObject> i = preChoix.eAllContents() ; i.hasNext() ; ){
			EObject next = i.next();
			if (aClass.isInstance(next)) {
				T interne = (T) next;
				result.add(interne);
			}
		}
		return result ;
	}
	
}