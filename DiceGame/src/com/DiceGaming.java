


package com;

import java.util.Random;
import java.util.Scanner;

public class DiceGaming {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Random random = new Random();

			int score = 0;
			int input;

			System.out.println("starting score = 0");

			for (int i = 0; i < 5; i++) { // only 6 chances 0 to 5
				System.out.print("Enter 10 to roll the dice:");
				input = sc.nextInt();

				if (input != 10) {
					System.out.print("Invalid! try again");
					continue;
				}
				int dice = random.nextInt(6) + 1; // dice values ( 1 - 6 only)
				System.out.println("Dice value :" + dice);

				if (dice == 1) {
					System.out.println("you are out of the game");
					break;
				} else {
					score += dice;
				}
			}
			
			System.out.println("Final score :" + score);
		}
	}
}
