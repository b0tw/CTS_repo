package ro.ase.csie.ccts.g1093.dp.prototype;

public class TestPrototype {
	public static void main(String[] args) {
		Char3DModel mickeyMouse = new Char3DModel(CharacterType.DISNEY, "red");
//		Char3DModel mickeyMouse2 = new Char3DModel(CharacterType.DISNEY, "red");
//		Char3DModel mickeyMouse3 = new Char3DModel(CharacterType.DISNEY, "red");
		try {
			Char3DModel mickeyMouse2 = (Char3DModel) mickeyMouse.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Char3DModel mickeyMouse3 = (Char3DModel) mickeyMouse.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
