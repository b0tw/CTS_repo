package ro.ase.csie.cts.g1093.pattern.builder;

public class Server implements ServerInterface{

	private String ipAddress;
	private int port;
	private int maxConnections;
	

	private Server() {
		super();
	}

	private Server(String ipAddress, int port, int maxConnections) {
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
	
	public static class ServerBuilder{
		Server server;

		public ServerBuilder(String ipAddress, int port, int maxConnections) {
			this.server = new Server();
			this.server.ipAddress = ipAddress;
			this.server.port = port;
			this.server.maxConnections = maxConnections;
		}
		
		public ServerBuilder setIpAddress(String ipAddress) {
			this.server.ipAddress = ipAddress;
			return this;
		}
		
		public ServerBuilder setPort(int port) {
			this.server.port = port;
			return this;
		}
		public ServerBuilder setMaxConnections(int maxConnections) {
			this.server.maxConnections = maxConnections;
			return this;
		}
		public Server build() {
			return this.server;
		}
		
	}

}
