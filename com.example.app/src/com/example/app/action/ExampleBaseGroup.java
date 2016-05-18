// Example of action group implementation

package com.example.app.action;

import java.util.Collections;
import java.util.List;

import com.biobam.blast2go.api.action.IB2GBaseGroup;
import com.biobam.blast2go.api.action.icon.IB2GIcon;

public class ExampleBaseGroup implements IB2GBaseGroup {

	public static ExampleBaseGroup INSTANCE = new ExampleBaseGroup();

	private ExampleBaseGroup() {
		// We make this private to use INSTANCE instead.
	}

	@Override
	public IB2GIcon getGroupIcon() {
		// Set your group icons.
		// The small icon is used in menus and the medium in the tool bar.
		return IB2GIcon.DEFAULT_EMPTY_ICON;
	}

	@Override
	public String getGroupId() {
		// Set a unique group id identifier
		return "com.example.app.action.group";
	}

	@Override
	public String getName() {
		// Set a unique group id identifier
		return "Hello Example";
	}

	@Override
	public IB2GBaseGroup getParentGroup() {
		// The parent must be the base group if this is your main group.
		// For subgroups set your own parent group.
		return IB2GBaseGroup.BASE_GROUP;
	}

	@Override
	public int getPreferredPositionInMenu() {
		// Preferred position when there is more than one entry in the menu.
		return 10;
	}

	@Override
	public List<Integer> getSeparatorsPrefferedPositions() {
		// Return the positions where you define separators, inside this group.
		return Collections.emptyList();
	}

}
