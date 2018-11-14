package ictgradschool.industry.controlflow.guessing;

import ictgradschool.Keyboard;

/**
 * A guessing game!
 */
public class GuessingGame {

    public void start() {

        //  Write your code here.
        int goal = (int) (Math.random()*100);
        int guess = 0;

        while (guess!=goal){
            System.out.print("Enter your guess (1-100): ");
            guess = Integer.parseInt(Keyboard.readInput());

            if (guess>goal){
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }

        System.out.println("Perfect");
        System.out.println("Goodbye");

    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
