package com.example.app.algo;

import com.biobam.blast2go.api.job.parameters.Parameters;
import com.biobam.blast2go.api.job.parameters.key.IntegerKey;
import com.biobam.blast2go.api.job.parameters.key.StringKey;
import com.biobam.blast2go.api.job.parameters.key.validator.IntegerValidator;

public class ExampleParameters extends Parameters {

	public ExampleParameters() {
		add(stringKeyExample);
	}

	public StringKey stringKeyExample = StringKey.builder(getBaseName("stringKeyExample"), "")
	        .setMessage("Insert text here ... ")
	        .setName("StringKey example")
	        .setDescription("This is an example of a StringKey linked to a StringWidget in a wizard.")
	        .build();

	public IntegerKey integerKey = IntegerKey.builder(getBaseName("integerKey"), 3)
	        .setName("Integer key example")
	        .setDescription("This is an example of an IntegerKey linked to a StringWidget in a wizard.")
	        .setValidator(IntegerValidator.inRange(1, 10))
	        .build();

	
	
}
