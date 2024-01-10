/*
  DiceGameMethod2 is DiceGameMethod
  except it can play multiple games
  and it can tell minimum value or maximum value
  and it can calculate average dice row
  Author: Metee Yingyongwatthanakit
  ID: 633040174-2
  Sec: 2
  Date: 18 February 2021
*/
package yingyongwatthanakit.metee.midterm;

import java.util.Scanner;

public class DiceGameMethod2 {
    static String answer;
    static String playGame = "g";
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static double avg;
    static int sum = 0;
    static int numDice = 0;
    static Scanner input = new Scanner(System.in);

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
            if (min >= diceRow) {
                min = diceRow;
            }
            if (max <= diceRow) {
                max = diceRow;
            }
            numDice++;
            total += diceRow;
            sum += diceRow;
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
        while(true) {
            System.out.println("Enter g to play again, q to quit, x for maximum, n for minimum, and v for average");
            playGame = input.next();
            switch (playGame.toLowerCase()) {
                case "g":
                    getAnswer();
                    playDiceGame();
                case "q":
                    System.exit(0);
                case "x":
                    printMax();
                    continue;
                case "n":
                    printMin();
                    continue;
                case "v":
                    printAverage();
            }
        }
    }

    public static void printMin() {
        System.out.println(min);
    }

    public static void printMax() {
        System.out.println(max);
    }

    public static void printAverage() {
        avg = (double) sum / numDice;
        System.out.println(sum + " : " + numDice);
        String formatAvg = String.format("%.2f", avg);
        System.out.println("Average = " + formatAvg);
    }

    public static void main(String[] args) {
        getAnswer();
        playDiceGame();
    }
}