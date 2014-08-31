package org.coordipsy.prechoice.prechoice.presentation;

import java.util.Collections;
import java.util.List;

import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.utils.GetAll;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

/**
 * @author Juliette
 *
 */
public class PreChoixContentProvider extends AdapterFactoryContentProvider  {

	public PreChoixContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object[] getElements(Object object) {
		if (object instanceof PreChoix) {
			PreChoix prechoix = (PreChoix) object;
			List<Interne> all = new GetAll<Interne>(Interne.class).getAll(prechoix);
			Collections.sort(all,new InterneComparator());
			return all.toArray();
		}
		return super.getElements(object);
	}
	
	

}
