package ro.ase.csie.cts.g1093.dp.flyweight;

public class ScreenData implements Model3DInterface {
	int x, y, z;
	String textureColor;

	public ScreenData(int x, int y, int z, String textureColor) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.textureColor = textureColor;
	}

	@Override
	public void display(ScreenData screenDetails) {
		// TODO Auto-generated method stub
		
	}

}
