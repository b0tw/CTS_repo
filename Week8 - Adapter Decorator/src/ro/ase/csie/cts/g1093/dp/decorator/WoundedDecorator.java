package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.ACMECharacter;

public class WoundedDecorator extends ACMEAbstractDecorator {

	public final static int MIN_POINTS = 200;

	public WoundedDecorator(ACMECharacter hero) {
		super(hero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		if(this.character.getLifePoints() <= 100) {
			System.out.println(String.format("%s is not moving", character.getName()));
		}
		else {
			System.out.println(String.format("%s is moving", character.getName()));
		}
	}

	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		this.character.takeAHit(points);
	}

}
