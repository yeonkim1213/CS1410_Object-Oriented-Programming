package lab.lab1;

public class battleGame {
	
	public static boolean winsFight(double strength, double monsterPower, boolean useSword) {
		double effectiveStrength = strength;
		if (useSword) {
			effectiveStrength = effectiveStrength * 2;
		}
		
		return effectiveStrength > monsterPower;
	}
	
	public static void main(String[] args) {
		// Read through the code and keep track of the values of the
		// variables at the end of each battle (IE after each if statement).
		// 
		// After doing it on paper, add some print statements to check your
		// answers.
		
		int livesLeft = 3;
		double strength = 100.0;
		double score = 0;
		boolean hasSword = false;

		double monsterPower = 150;
		
		//System.out.println("livesLeft: " + livesLeft);
		//System.out.println("strength: " + strength);
		//System.out.println("score: " + score);
		//System.out.println("hasSword: " + hasSword);
		//System.out.println("monsterPower: " + monsterPower);
		
		
		if (winsFight(strength, monsterPower, hasSword)) {
			score = score + monsterPower;
		} else {
			livesLeft = livesLeft - 1;
		}

		
		monsterPower = 70;
		if (winsFight(strength, monsterPower, hasSword)) {
			score = score + monsterPower;
			hasSword = true;
		} else {
			livesLeft = livesLeft - 1;
		}
		
		
		monsterPower = monsterPower * 2;
		if (winsFight(strength, monsterPower, hasSword)) {
			score = score + monsterPower;
			strength = strength + 10;
		} else {
			livesLeft = livesLeft - 1;
		}
		
		
		monsterPower = 310;
		if (winsFight(strength, monsterPower, hasSword)) {
			score = score + monsterPower;
		} else {
			livesLeft = livesLeft - 1;
		}
		
		
		monsterPower = monsterPower - strength;
		if (winsFight(strength, monsterPower, hasSword)) {
			score = score + monsterPower;
		} else {
			livesLeft = livesLeft - 1;
		}
		
		
		if (hasSword) {
			monsterPower = monsterPower * 3;
		}
		if (winsFight(strength, monsterPower, hasSword)) {
			score = score + monsterPower;
		} else {
			livesLeft = livesLeft - 2;
		}
		
		
		System.out.println("Game over.");
	}
	
	

}
