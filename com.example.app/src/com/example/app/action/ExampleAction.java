// Hello world action implementation

package com.example.app.action;

import java.util.EnumSet;
import java.util.Set;

import com.biobam.blast2go.api.action.ActionType;
import com.biobam.blast2go.api.action.B2GAction;
import com.biobam.blast2go.api.action.IB2GBaseGroup;
import com.biobam.blast2go.api.action.PlaceTag;
import com.biobam.blast2go.api.action.icon.IB2GIcon;
import com.biobam.blast2go.api.wizard.B2GWizard;
import com.example.app.algo.ExampleJobMetadata;
import com.example.app.wizard.ExampleWizard;

public class ExampleAction extends B2GAction<ExampleJobMetadata> {

	@Override
	public IB2GBaseGroup getActionGroup() {
		return ExampleBaseGroup.INSTANCE;
	}

	@Override
	public IB2GIcon getActionIcon() {
		return IB2GIcon.DEFAULT_EMPTY_ICON;
	}

	@Override
	public ActionType getActionType() {
		return ActionType.RUN;
	}

	@Override
	public String getId() {
		// Set your own ID Here. The ID Must be unique.
		return "com.example.app.action";
	}

	@Override
	public String getName() {
		return "Example Action";
	}

	@Override
	public Set<PlaceTag> getPlaceTags() {
		return EnumSet.of(PlaceTag.MENU_TOOLS);
	}

	@Override
	public int getPreferredPositionInMenu() {
		return 10;
	}

	@Override
	public Class<? extends B2GWizard<?>> getWizardClass() {
		return ExampleWizard.class;
	}

	@Override
	public Class<ExampleJobMetadata> jobMetadataClass() {
		return ExampleJobMetadata.class;
	}

}
