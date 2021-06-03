package ro.ase.csie.cts.g1093.pattern.prototype;

public class Server implements ServerInterface, Cloneable {
	
	String ipAddress;
	int port;
	int maxConnections;
	
	private Server() {
		super();
	}

	public Server(String ipAddress, int port, int maxConnections) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
	}

	@Override
	public String getIpAddress() {
		return this.ipAddress;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getMaxConnections() {
		return this.maxConnections;
	}

	@Override
	public boolean connect() {
		return false;
	}

	@Override
	public boolean disconnect() {
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Server copy = new Server();
		copy.ipAddress = this.ipAddress;
		copy.maxConnections = this.maxConnections;
		copy.port = this.port;
		return copy;
	}

	
}
