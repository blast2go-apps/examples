package com.example.app.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.biobam.blast2go.api.datatype.AbstractB2GObject;
import com.biobam.blast2go.api.datatype.B2GObjectInfo;
import com.biobam.blast2go.api.datatype.B2GObjectValue;

public class ExampleObject extends AbstractB2GObject {

	public ExampleObject(B2GObjectInfo objectInfo) {
		super(objectInfo);
	}

	Map<String, ExampleEntry> entries = new HashMap<>();

	public ExampleObject(String name) {
		super(name);
	}

	@Override
	public void loadValue(B2GObjectValue valueObject) {

	}

	@Override
	public B2GObjectValue saveValue() {
		return new ExampleObjectValue(this);
	}

	@Override
	public String getType() {
		return "EXAMPLE";
	}

	public ExampleEntry getEntry(String id) {
		return entries.get(id);
	}

	public List<String> getIdList() {
		return new ArrayList<String>(entries.keySet());
	}

	public void addEntry(String id, ExampleEntry entry) {
		entries.put(id, entry);
	}

}
