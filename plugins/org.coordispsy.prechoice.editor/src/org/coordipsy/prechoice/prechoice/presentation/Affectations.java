package org.coordipsy.prechoice.prechoice.presentation;

import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.generators.AffectationDInternes;
import org.coordipsy.prechoice.prechoice.generators.HTMLGenerator;
import org.coordipsy.prechoice.prechoice.utils.Utils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class Affectations extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private ComposedAdapterFactory adapterFactory;
	private Table table;
	private final AdapterFactoryEditingDomain editingDomain;
	private TableViewer tableViewer;
	private PreChoix preChoix;
	private Text txtPremierChoix;
	private Text txtDeuxiemeChoix;
	private Text txtTroisiemeChoix;
	private Text txtQuatriemeChoix;
	private Text txteChoixEt;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 * @param editingDomain 
	 */
	public Affectations(Composite parent, int style, AdapterFactoryEditingDomain editingDomain, ComposedAdapterFactory factory) {
		super(parent, style);
		adapterFactory = factory;
		this.editingDomain = editingDomain;
		ResourceSet set = Affectations.this.editingDomain.getResourceSet();
		EObject tmp = set.getResources().get(0).getContents().get(0);
		if (tmp instanceof PreChoix) {
			preChoix = (PreChoix) tmp;
		}
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(this, SWT.NONE);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));
		new Label(composite, SWT.NONE);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.adapt(composite_1);
		toolkit.paintBordersFor(composite_1);
		TableColumnLayout tcl_composite_1 = new TableColumnLayout();
		composite_1.setLayout(tcl_composite_1);
		
		tableViewer = new TableViewer(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewer.setUseHashlookup(true);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		toolkit.paintBordersFor(table);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tcl_composite_1.setColumnData(tblclmnNewColumn, new ColumnPixelData(174, true, true));
		tblclmnNewColumn.setText("Stage");
		
		TableColumn tblclmnInterne = new TableColumn(table, SWT.NONE);
		tcl_composite_1.setColumnData(tblclmnInterne, new ColumnPixelData(223, true, true));
		tblclmnInterne.setText("Interne");
		tableViewer.setLabelProvider(new PreChoixTableLabelProvider(adapterFactory));
		tableViewer.setContentProvider(new PreChoixContentProvider(adapterFactory));
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(composite_2);
		toolkit.paintBordersFor(composite_2);
		composite_2.setLayout(new GridLayout(2, false));
		
		Composite composite_3 = new Composite(composite_2, SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		toolkit.adapt(composite_3);
		toolkit.paintBordersFor(composite_3);
		composite_3.setLayout(new GridLayout(1, false));
		Button btnCalculerAutomatiquementLes = toolkit.createButton(composite_3, "Calculer Automatiquement les affectations", SWT.NONE);
		
		Button btnNewButton = new Button(composite_3, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				HTMLGenerator gen = new HTMLGenerator();
				String code = gen.generate(preChoix);
				CodeDialog d = new CodeDialog(getShell(),code);
				d.open();
			}
		});
		toolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("G\u00E9n\u00E9rer texte pour site");
		btnCalculerAutomatiquementLes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceSet set = Affectations.this.editingDomain.getResourceSet();
				EObject tmp = set.getResources().get(0).getContents().get(0);
				if (tmp instanceof PreChoix) {
					PreChoix preChoix = (PreChoix) tmp;
					Command command = new AffectationDInternes(preChoix).process(Affectations.this.editingDomain);
					Affectations.this.editingDomain.getCommandStack().execute(command);
					tableViewer.setInput(preChoix);
				}
			}
		});
		
		Composite composite_4 = new Composite(composite_2, SWT.NONE);
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		toolkit.adapt(composite_4);
		toolkit.paintBordersFor(composite_4);
		composite_4.setLayout(new GridLayout(1, false));
		
		txtPremierChoix = new Text(composite_4, SWT.BORDER);
		txtPremierChoix.setEditable(false);
		txtPremierChoix.setText("premier choix");
		txtPremierChoix.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(txtPremierChoix, true, true);
		txtPremierChoix.setBackground(Utils.PREMIER_CHOIX);
		
		txtDeuxiemeChoix = new Text(composite_4, SWT.BORDER);
		txtDeuxiemeChoix.setEditable(false);
		txtDeuxiemeChoix.setText("deuxieme choix");
		txtDeuxiemeChoix.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(txtDeuxiemeChoix, true, true);
		txtDeuxiemeChoix.setBackground(Utils.DEUXIEME_CHOIX);
		
		txtTroisiemeChoix = new Text(composite_4, SWT.BORDER);
		txtTroisiemeChoix.setEditable(false);
		txtTroisiemeChoix.setText("troisieme choix");
		txtTroisiemeChoix.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		txtTroisiemeChoix.setBounds(0, 0, 76, 21);
		toolkit.adapt(txtTroisiemeChoix, true, true);
		txtTroisiemeChoix.setBackground(Utils.TROISIEME_CHOIX);
		
		txtQuatriemeChoix = new Text(composite_4, SWT.BORDER);
		txtQuatriemeChoix.setEditable(false);
		txtQuatriemeChoix.setText("quatrieme choix");
		txtQuatriemeChoix.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtQuatriemeChoix.setBounds(0, 0, 76, 21);
		toolkit.adapt(txtQuatriemeChoix, true, true);
		txtQuatriemeChoix.setBackground(Utils.QUATRIEME_CHOIX);
		
		txteChoixEt = new Text(composite_4, SWT.BORDER);
		txteChoixEt.setEditable(false);
		txteChoixEt.setText("5e choix et +");
		txteChoixEt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txteChoixEt.setBounds(0, 0, 76, 21);
		toolkit.adapt(txteChoixEt, true, true);
		txteChoixEt.setBackground(Utils.CINQUIEME_CHOIX);
		tableViewer.setInput(preChoix);

	}

	public void setAdapterFactory(ComposedAdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
		
	}

	public void refresh() {
		tableViewer.refresh(true);
	}
}
