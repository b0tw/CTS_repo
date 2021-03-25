package ro.ase.csie.cts.g1093.dp.singleton.staticversion;

public class RESTBackend {
	String url;
	String data;

	public static final RESTBackend theBackend;

	// executed only once
	static {
		System.out.println("is executed when the class is loaded by the JVM");
		// get the data from config files or something else
		theBackend = new RESTBackend();
		theBackend.url = "www.acs.ase.ro/cts";
		theBackend.data = "";
	}

	//another block
	{
		System.out.println("Is executed before any constructor call");
	}
	
	private RESTBackend() {
		// get the data from config files or something else
	}
}
