package com.example.app.dataviewer.controllers;

import com.biobam.blast2go.api.dataviewer.interfaces.IB2GObjectController;
import com.biobam.blast2go.api.dataviewer.interfaces.IB2GObjectControllerCreator;
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

}
