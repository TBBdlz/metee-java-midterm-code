/*
  This program is DiceGame but it has
  methods: getAnswer() and playDiceGame()
  Author: Metee Yingyongwatthanakit
  ID: 633040174-2
  Sec: 2
  Date: 18 February 2021
*/
package yingyongwatthanakit.metee.midterm;

import java.util.Scanner;

public class DiceGameMethod {
    static String answer;

    public static void getAnswer() {
        while (true) {
            System.out.println("Enter your guess (h for high and l for low) :");
            Scanner scan = new Scanner(System.in);
            answer = scan.next();
            if (!(answer.equals("h") || answer.equals("l"))) {
                System.out.println("Guess l for low / h for high");
                continue;
            }
            break;
        }
    }

    public static void playDiceGame() {
        System.out.print("Dices roll : ");
        boolean winStatus = false;
        int diceRow, total = 0;
        for (int i = 0; i < 3; i++) {
            diceRow = 1 + (int)(Math.random() * (6 - 1) + 1);
            total += diceRow;
            System.out.print(diceRow + " ");
            if (i == 2) {
                System.out.println(); // space styling
            }
        }
        System.out.println("Total : " + total);
        switch (answer) {
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

    public static void main(String[] args) {
        getAnswer();
        playDiceGame();
    }
}