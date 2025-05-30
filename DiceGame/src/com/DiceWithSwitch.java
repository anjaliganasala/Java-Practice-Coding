package com;

import java.util.Random;
import java.util.Scanner;

public class DiceWithSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int score = 0;
		int input;

		System.out.println("Your starting score = 0");

		while (true) {

			System.out.print("Enter 10 to roll the dice: ");
			input = sc.nextInt();

			if (input != 10) {
				System.out.println("Invalid number!! Enter 10 to roll.");
				continue;

			}

			int dice = random.nextInt(6) + 1;
			System.out.println("Dice value: " + dice);

			switch (dice) {
			case 1:
				System.out.println("You are out of the game!!!!");
				System.out.println("Final score: " + score);	
				return;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				score += dice;
				break;
			}
		}
	}
}
