package ro.ase.csie.ccts.g1093.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Char3DModel implements Cloneable {

	CharacterType type;
	String color;

	ArrayList<Integer> points = new ArrayList<>();

	private Char3DModel() {
	}

	public Char3DModel(CharacterType type, String color) {
		this.type = type;
		this.color = color;

		System.out.println("Generating the 3D model points.........");

		try {
			Thread.sleep(2000);
			Random random = new Random(10);
			for (int i = 0; i < 20; i++) {
				points.add(random.nextInt(1000));
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// don't
		// Char3DModel copy = new Char3DModel(this.type, this.color);

		Char3DModel copy = new Char3DModel();
		copy.type = this.type;
		copy.color = this.color;
		copy.points = (ArrayList<Integer>) this.points.clone();
		return copy;
	}

}
