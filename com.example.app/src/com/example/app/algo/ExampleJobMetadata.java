// Implementation of the Hello World JobMetadata

package com.example.app.algo;

import java.util.List;

import com.biobam.blast2go.api.job.IB2GJobMetadata;
import com.biobam.blast2go.api.job.InputDefinition;

public class ExampleJobMetadata implements IB2GJobMetadata<ExampleJob, ExampleParameters> {

	@Override
	public List<InputDefinition<?>> additionalRequirements() {
		// Define the platform services you need.
		return InputDefinition.EMPTY_LIST;
	}

	@Override
	public List<InputDefinition<?>> inputs() {
		// Define the DATA input requirements.
		return InputDefinition.EMPTY_LIST;
	}

	@Override
	public Class<ExampleJob> jobClass() {
		// The class of the job described by this metadata.
		return ExampleJob.class;
	}

	@Override
	public List<InputDefinition<?>> outputs() {
		// Define possible job outputs.
		return InputDefinition.EMPTY_LIST;
	}

	@Override
	public Class<ExampleParameters> parametersClass() {
		// The class of the job parameters.
		return ExampleParameters.class;
	}
}
