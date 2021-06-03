package ro.ase.csie.cts.g1093.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1093.pattern.singleton.Server;

public class TestSingleton {

	static Server server;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		server = Server.getServer("89.136.175.16", 8080, 12);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIpAddress() {
		String expectedIpAddress = "89.136.175.16";
		assertEquals("Testing with an ip address", expectedIpAddress, server.getIpAddress());
	}

	@Test
	public void testGetMaxConnections() {
		int expectedMaxConnections = 12;
		assertEquals("Testing with max connections", expectedMaxConnections, server.getMaxConnections());
	}

	@Test
	public void testGetPort() {
		int expectedPort = 8080;
		assertEquals("Testing with a port", expectedPort, server.getPort());
	}

	@Test
	public void testSingletonImplementation() {
		Server otherServer = Server.getServer("89.136.0.0", 8000, 3);
		assertEquals("Testing with other server", otherServer, server);
	}
}
