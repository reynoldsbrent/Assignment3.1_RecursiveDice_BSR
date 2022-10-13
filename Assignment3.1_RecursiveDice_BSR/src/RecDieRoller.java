
/**
 * This class contains the rollDie() method that rolls the dice until it rolls the number 2
 * It prints out each of the dice rolls including the number 2
 * @author brentreynolds
 * @version 10/11/22 Fall 2022
 */
public class RecDieRoller {
	
	private int numberOfRollsUntilTwo;

	/**
	 * This method rolls a dice until it rolls a 2. It prints out each of the roll attempts.
	 * @return the number of rolls it takes to land on the number 2.
	 */
	public int rollDie() {
		numberOfRollsUntilTwo += 1;
		
		int number = (int) (Math.random() * 6) + 1;
		
		System.out.println(number);
		
		if(number != 2) {
			return rollDie();
		}
		
		else {
			int numOfRolls = numberOfRollsUntilTwo;
			numberOfRollsUntilTwo = 0;
			return numOfRolls;
		}
		
	}
}
