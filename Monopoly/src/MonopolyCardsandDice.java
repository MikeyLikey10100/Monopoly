import java.util.Scanner;

public class MonopolyCardsandDice
	{

		public static void dice()
			{
				Scanner userInput = new Scanner(System.in);
				int randomNumber1 = (int) (Math.random() *6 + 1);
				int randomNumber2 = (int) (Math.random() *6 + 1);
			
				System.out.println("Click enter to roll");
				String roll = userInput.nextLine(); 

				int diceA = randomNumber1; 
				int diceB = randomNumber2; 
				int diceSum = diceA + diceB;
				System.out.println(" You rolled: " + diceA + " and " + diceB + " For a total of " + diceSum + " Please roll again.");
//test
			}

	}
