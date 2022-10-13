
/**
 * This class calculates the average amount of rolls needed to roll the number 2 on a six sided dice.
 * @author brentreynolds
 * @version 10/11/22 Fall 2022
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		double sum = 0;
		double average;
		
		RecDieRoller die = new RecDieRoller();
		
		while(count <= 1000) {
			
		sum += die.rollDie();
		count++;
		}
		
		average = sum / 1000;
		
		System.out.println("The average number of rolls it takes to roll a 2 is: " + average);

	}

}
