package com.example.app.wizard;

import org.eclipse.swt.widgets.Composite;

import com.biobam.blast2go.api.wizard.B2GWizard;
import com.biobam.blast2go.api.wizard.page.B2GWizardPage;
import com.biobam.blast2go.api.wizard.page.widget.implementations.IntegerWidget;
import com.biobam.blast2go.api.wizard.page.widget.implementations.StringWidget;
import com.example.app.algo.ExampleParameters;

public class ExampleWizard extends B2GWizard<ExampleParameters> {

	public ExampleWizard() {
		setWindowTitle("Example Wizard");
	}

	@Override
	protected void definePages() {
		ExampleParameters parameters = getParameters();

		addPage(new B2GWizardPage("Example wizard page.") {

			@Override
			public void definePage(Composite parent) {
				addWidget(StringWidget.create(parent, parameters.stringKeyExample));
				addWidget(IntegerWidget.create(parent, parameters.integerKey));
			}
		});
	}

}
