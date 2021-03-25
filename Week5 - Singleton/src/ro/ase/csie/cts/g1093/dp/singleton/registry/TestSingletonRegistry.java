package ro.ase.csie.cts.g1093.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		
		RESTBackend backend1 = RESTBackend.getTESTBackend("10.0.0.1", "PROFILE");
		RESTBackend backend2 = RESTBackend.getTESTBackend("10.0.0.1", "PROFILE");
		
		if(backend1 == backend2) {
			System.out.println("They are the same object");
		}
		else {
			System.out.println("They are different");
		}
		RESTBackend backend3 = RESTBackend.getTESTBackend("127.0.01", "PROFILE");
		if(backend1 == backend3) {
			System.out.println("They are the same object");
		}
		else {
			System.out.println("They are different");
		}
	}

}
