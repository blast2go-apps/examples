// This is an example of a B2GJob implementation implementation which should contain
// the implementation of your algorithm or should call the program in case of a wrapper.

package com.example.app.algo;

import java.util.concurrent.TimeUnit;

import com.biobam.blast2go.api.datatype.basics.html.B2GHtml;
import com.biobam.blast2go.api.job.B2GJob;
import com.example.app.data.ExampleEntry;
import com.example.app.data.ExampleObject;

public class ExampleJob extends B2GJob<ExampleParameters> {

	public ExampleJob() {
		super("Example Algo", new ExampleParameters());
	}

	@Override
	public void run() throws InterruptedException {
		// Post an application message.
		postApplicationMessage("Hello World!");

		// Notify that my task will need 4 steps (for the progress bar)
		beginTask("Example Algo...", 4);

		// Create a html object and post it as output.

		subTask("Creating the html content");
		String htmlContent = "<html><body>Hello World!</body></html>";
		B2GHtml b2gHtml = B2GHtml.newInstance("example_html", htmlContent);
		postOutputResults(b2gHtml);

		worked(1);

		// Create an example object which can be opened in a generic table.

		subTask("Creating the table content");
		ExampleObject exampleObject = new ExampleObject("Example_object_created_in_job");
		exampleObject.addEntry("one", new ExampleEntry("John Smith", 1234));
		exampleObject.addEntry("two", new ExampleEntry("Johanna Smith", 2234));
		postOutputResults(exampleObject);

		worked(1);

		// Do some extra time consuming job...
		subTask("Done in 2");
		TimeUnit.SECONDS.sleep(1);
		worked(1);

		subTask("Done in 1");
		TimeUnit.SECONDS.sleep(1);
		worked(1);

	}
}
