/*
  DiceGame is a game let player guess value sum of dice row
  The dice will row 3 times with Math.random method
  player that guess l for low can win if sum is less or equal 10
  player that guess h for high can win if sum is greater than 10
  Author: Metee Yingyongwatthanakit
  ID: 633040174-2
  Sec: 2
  Date: 18 February 2021
*/
package yingyongwatthanakit.metee.midterm;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        boolean winStatus = false;
        int diceRow, total = 0;
        String guess;
        System.out.println("Enter your guess (h for high and l for low) :");
        Scanner scan = new Scanner(System.in);
        guess = scan.next();
        System.out.print("Dices roll : ");
        for (int i = 0; i < 3; i++) {
            diceRow = 1 + (int)(Math.random() * (6 - 1) + 1);
            total += diceRow;
            System.out.print(diceRow + " ");
            if (i == 2) {
                System.out.println(); // space styling
            }
        }
        System.out.println("Total : " + total);
        switch (guess.toLowerCase()) {
            case "h":
                if (total > 10) {
                    winStatus = true;
                }
                break;
            case "l":
                if (total <= 10) {
                    winStatus = true;
                }
                break;
        }
        if (winStatus) {
            System.out.println("Congratulations. You win.");
        } else {
            System.out.println("Sorry. You lose.");
        }
    }
}