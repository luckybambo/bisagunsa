package zzz.simplegames;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		String[] rps = { "rock", "paper", "scissors" };
		String cpuMove = rps[new Random().nextInt(rps.length)];

		Scanner scan = new Scanner(System.in);

		String playerMove;

		while (true) {
			while (true) {
				System.out.println("Rock, Paper, or Scissors?");
				playerMove = scan.nextLine();
				if (playerMove.equalsIgnoreCase("rock") || playerMove.equals("paper")
						|| playerMove.equals("scissors")) {
					break;
				}
				System.out.println("What is " + playerMove + "?");
			}

			System.out.println("I play: " + cpuMove);

			if (playerMove.equals(cpuMove)) {
				System.out.println("The game was a tie");
			} else if (playerMove.equalsIgnoreCase("rock") && cpuMove.equals("scissors")
					|| playerMove.equalsIgnoreCase("paper") && cpuMove.equals("rock")
					|| playerMove.equalsIgnoreCase("scissors") && cpuMove.equals("paper")) {
				System.out.println("You win!");
			} else if (playerMove.equalsIgnoreCase("rock") && cpuMove.equals("paper")
					|| playerMove.equalsIgnoreCase("paper") && cpuMove.equals("scissors")
					|| playerMove.equalsIgnoreCase("scissors") && cpuMove.equals("rock")) {
				System.out.println("You lose!");
			}

			System.out.println("Wanna play again?");
			String playOption = scan.nextLine();
			if(!playOption.equalsIgnoreCase("Yes")) {
				break;
			}
			
		}
		scan.close();
	}
	

}
