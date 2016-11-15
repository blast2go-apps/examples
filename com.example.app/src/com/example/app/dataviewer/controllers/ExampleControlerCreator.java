package com.example.app.dataviewer.controllers;

import java.util.EnumSet;

import com.biobam.blast2go.api.dataviewer.interfaces.IB2GObjectController;
import com.biobam.blast2go.api.dataviewer.interfaces.IB2GObjectControllerCreator;
import com.biobam.blast2go.api.dataviewer.interfaces.WorkbenchProperty;
import com.example.app.data.ExampleObject;

public class ExampleControlerCreator implements IB2GObjectControllerCreator<ExampleObject> {

	@Override
	public IB2GObjectController<?> getControllerInstance(ExampleObject dataObject) {
		return new ExampleGenericTableDataviewerControler(dataObject);
	}

	@Override
	public Class<ExampleObject> getObjectClass() {
		return ExampleObject.class;
	}

	@Override
	public Class<? extends IB2GObjectController<?>> getObjectControllerClass() {
		return ExampleGenericTableDataviewerControler.class;
	}

	@Override
	public int getPreferredPositionInMenu() {
		return 0;
	}

	@Override
	public String getViewerName() {
		return "My Viewer";
	}

	@Override
	public EnumSet<WorkbenchProperty> getWorkbenchProperties() {
		return EnumSet.of(WorkbenchProperty.DEFAULT_VIEWER, WorkbenchProperty.IMPORTANCE_PRIMARY_VIEWER,
				WorkbenchProperty.POSITION_RESULT);
	}

}
