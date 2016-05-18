package com.example.app.data;

import java.net.URL;

import com.biobam.blast2go.api.datatype.B2GObject;
import com.biobam.blast2go.api.datatype.B2GObjectCreator;
import com.biobam.blast2go.api.datatype.B2GObjectInfo;
import com.biobam.blast2go.api.datatype.B2GObjectValue;

public class ExampleObjectCreator implements B2GObjectCreator {

	@Override
	public B2GObject create(B2GObjectInfo info) {
		return new ExampleObject(info);
	}

	@Override
	public URL getIcon() {
		return getClass().getResource("/res/object_16_icon.png");
	}

	@Override
	public Class<? extends B2GObject> getObjectClass() {
		return ExampleObject.class;
	}

	@Override
	public Class<? extends B2GObjectValue> getValueClass() {
		return ExampleObjectValue.class;
	}

}
