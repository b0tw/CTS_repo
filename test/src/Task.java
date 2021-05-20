
public class Task implements IProcesatorCerere{

	IModule module;
	
	@Override
	public void procesareCerere(TipCerere tip, String denumire) {
		module.doTheTask();
		
	}

}
