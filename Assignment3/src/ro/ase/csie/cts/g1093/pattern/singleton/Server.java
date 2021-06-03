package ro.ase.csie.cts.g1093.pattern.singleton;

public class Server implements ServerInterface {

	String ipAddress;
	int port;
	int maxConnections;
	
	private static Server theServer = null;
	
	private Server(String ipAddress, int port, int maxConnections) {
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
	}
	
	
	private Server() {
	}


	@Override
	public String getIpAddress() {
		return theServer.ipAddress;
	}

	@Override
	public int getPort() {
		return theServer.port;
	}

	@Override
	public int getMaxConnections() {
		return theServer.maxConnections;
	}

	@Override
	public boolean connect() {
		return false;
	}

	@Override
	public boolean disconnect() {
		return false;
	}
	
	public static synchronized Server getServer(String ipAddress, int port, int maxConnections) {
		if(theServer == null) {
			theServer = new Server(ipAddress, port, maxConnections);
		}
		return theServer;
	}
}
