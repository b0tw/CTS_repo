package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.ACMECharacter;
import ro.ase.csie.cts.g1093.dp.adapter.FantasyCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		ACMECharacter dragon = new FantasyCharacter("Blue Dragon", 1000);
		dragon.move();
		dragon.takeAHit(700);
		dragon.heal(100);

//		ACMECharacter dragonWithArmor = new ArmorDecorator(dragon, 200);
//		dragonWithArmor.takeAHit(300);

		dragon = new ArmorDecorator(dragon, 200);
		dragon.takeAHit(300);
		
		dragon = new WoundedDecorator(dragon);
		dragon.takeAHit(300);
		dragon.move();
		dragon.takeAHit(300);
		dragon.move();
		
		ACMECharacter dragon2 = new FantasyCharacter("Yellow Dragon", 1000);
		dragon2.move();
		dragon2.takeAHit(200);
		dragon2.heal(100);

	}
}
