package com.example.app.dataviewer.controllers;

import java.util.ArrayList;
import java.util.List;

import com.biobam.blast2go.api.core.utils.callback.CallBack;
import com.biobam.blast2go.api.datatype.B2GObject;
import com.biobam.blast2go.api.dataviewer.interfaces.tableformat.ColumnDataCreator;
import com.biobam.blast2go.api.dataviewer.interfaces.tableformat.IB2GTableFormat;
import com.biobam.blast2go.api.dataviewer.interfaces.tableformat.IColumnData;
import com.biobam.blast2go.api.dataviewer.interfaces.tableformat.ITableModelChangedCallback;
import com.example.app.data.ExampleEntry;
import com.example.app.data.ExampleObject;

public class ExampleGenericTableDataviewerControler implements IB2GTableFormat<B2GObject, ExampleEntry> {

	private ExampleObject myObject;

	public ExampleGenericTableDataviewerControler(ExampleObject myObject) {
		this.myObject = myObject;
	}

	@Override
	public B2GObject extractFrom(List<String> id) {
		ExampleObject exampleObject = new ExampleObject("extracted_object");
		// TODO: add entries specified in the parameters to this new object.
		return exampleObject;
	}

	@Override
	public List<IColumnData<?>> getColumnList() {
		List<IColumnData<?>> columnList = new ArrayList<>();
		columnList.add(ColumnDataCreator.stringColumnBuilder("Name")
		        .setContentCallback(new CallBack<String, String>() {

			        @Override
			        public String call(String id) {
				        return getEntry(id).getName();
			        }
		        })
		        .setMaxWidth(400)
		        .setPrefferedWidth(200)
		        .setMinWidth(30)
		        .build());
		columnList.add(ColumnDataCreator.integerColumnBuilder("Size")
		        .setContentCallback(new CallBack<String, Integer>() {

			        @Override
			        public Integer call(String id) {
				        return getEntry(id).getSize();
			        }
		        })
		        .setMaxWidth(400)
		        .setPrefferedWidth(200)
		        .setMinWidth(30)
		        .build());

		return columnList;
	}

	@Override
	public ExampleEntry getEntry(String id) {
		return myObject.getEntry(id);
	}

	@Override
	public List<String> getIdList() {
		return myObject.getIdList();
	}

	@Override
	public void setChangeCallback(ITableModelChangedCallback arg0) {}

	@Override
	public void setList(List<String> arg0) {}

	@Override
	public void viewerClosing() {}

	@Override
	public B2GObject getObject() {
		return myObject;
	}

	@Override
	public void updateObject(B2GObject newObject) {
		this.myObject = (ExampleObject) newObject;
	}

}
