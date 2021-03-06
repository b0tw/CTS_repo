package ro.ase.csie.cts.g1093.dp.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {

		ACMECharacter dragon = new FantasyCharacter("Blue Dragon", 1000);
		dragon.move();
		dragon.takeAHit(200);
		dragon.heal(100);

		DisneyActions donald = new DonaldDuck("Donald Duck", 500);
		donald.changeLocation(100, 50);
		donald.losePower(150);
		donald.recoverPower(100);

		// use the adapter
		ArrayList<ACMECharacter> characters = new ArrayList<ACMECharacter>();
		characters.add(dragon);
		characters.add(new Disney2ACMEAdapter(donald));

		System.out.println("--------------------------------------");
		
		for (ACMECharacter hero : characters) {
			hero.move();
			hero.takeAHit(50);
		}
	}

}
