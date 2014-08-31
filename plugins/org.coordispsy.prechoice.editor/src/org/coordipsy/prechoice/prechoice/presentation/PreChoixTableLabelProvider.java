package org.coordipsy.prechoice.prechoice.presentation;

import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.utils.Utils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

public class PreChoixTableLabelProvider extends AdapterFactoryLabelProvider implements ITableColorProvider {

	public PreChoixTableLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (object instanceof Interne) {
			Interne p = (Interne) object;
			if (columnIndex == 0){
				return getText(p);
			}
			if (columnIndex == 1){
				Stage affectes = p.getAffectation();
				return getText(affectes);
			}
			return "";
		}
		return super.getColumnText(object, columnIndex);
	}
	

	@Override
	public Color getBackground(Object object, int columnIndex) {
		if (object instanceof Interne) {
			Interne interne = (Interne) object;
			if (columnIndex == 1){
				Color color = Utils.getColor(interne);
				if (color != null){
					return color ;
				}
			}
		}
		return super.getBackground(object, columnIndex);
	}

	@Override
	public Image getColumnImage(Object object, int columnIndex) {
		if (object instanceof Interne) {
			Interne p = (Interne) object;
			if (columnIndex == 0){
				return getImage(p);
			}
			if (columnIndex == 1){
				Stage affectes = p.getAffectation();
				return getImage(affectes);
			}
			return super.getColumnImage(object, columnIndex);
		}
		return super.getColumnImage(object, columnIndex);
	}

	
	

}
