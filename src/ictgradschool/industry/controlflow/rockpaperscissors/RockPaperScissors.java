package ictgradschool.industry.controlflow.rockpaperscissors;


import ictgradschool.Keyboard;

import java.util.concurrent.TimeUnit;

/**
 A game of Rock, Paper Scissors
 */
public class RockPaperScissors {

    public static final int ROCK = 1;
    public static final int PAPPER = 2;
    public static final int SCISSORS = 3;


    //  Make similar constants for PAPER and SCISSORS, to improve readability of your code.

    public void start(String playerName) {

        // TODO Write your code here which calls your other methods in order to play the game. Implement this

//        String playerName;
        playerName = getPlayerName(playerName);

        System.out.println("\n1. Rock \n2. Paper \n3. Scissors \n4. Quit");

        int playerChoice = getPlayerChoice();

        testPlayerChoice(playerChoice,playerName);

        delay(500);

        displayPlayerChoice(playerName,playerChoice);

        int computerChoice = getComputerChoice();

        delay(500);

        displayPlayerChoice("Computer",computerChoice);

        delay(500);

        System.out.println(userWins(playerName,playerChoice,computerChoice)+" wins because" + getResultString(playerChoice,computerChoice));

        System.out.println("\n");

        delay(750);

        start(playerName);



        // as detailed in the exercise sheet.
    }

    private void delay(int mili){
        try {
            TimeUnit.MILLISECONDS.sleep(mili);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void testPlayerChoice(int playerChoice,String playerName) {
        if (playerChoice==4){
            System.out.println("\nBye " +playerName + " ...didn't want to keep playing with you anyway");
            System.exit(0);
        } else if (playerChoice!=1 && playerChoice!=2 && playerChoice!=3){
            System.out.println("\nDude, pick a valid number");
            start(playerName);
        }

    }


    public String getPlayerName(String playername){
            if (playername.length()==0) {
                System.out.print("Hi! What is your name? ");
                return Keyboard.readInput();
            } else {return playername;}
    }


    public int getPlayerChoice(){
        System.out.print("\nEnter choice: ");
        int playerChoice = Integer.parseInt(Keyboard.readInput());
        return playerChoice;
    }

    public String makeChoice(int num){
        String choice="";

        switch (num){

            case 1:
                choice = "rock";
                break;
            case 2:
                choice = "paper";
                break;
            case 3:
                choice = "scissors";
                break;
            case 4:
                choice = "leave";
                break;

        }
        return choice;
    }


    public void displayPlayerChoice(String name, int choice) {
        //  This method should print out a message stating that someone chose a particular thing (rock, paper or scissors)
        String userChoice = makeChoice(choice);
        System.out.println(name + " chose " + userChoice + ".");
    }


    private int getComputerChoice(){
        int computerChoice = (int)((Math.random()*3)+1);
        return computerChoice;
    }

// || playerChoice == computerChoice

    public String userWins(String playername,int playerChoice, int computerChoice) {
        //  Determine who wins and return true if the player won, false otherwise.
        if (playerChoice==1 && computerChoice==2 || playerChoice==2 && computerChoice==3 || playerChoice==3 && computerChoice==1){
            return "Computer";
        } else if (playerChoice==2 && computerChoice==1 || playerChoice==3 && computerChoice==2 || playerChoice==1 && computerChoice==3){
            return playername;
        }
        return "No one";
    }

    public String getResultString(int playerChoice, int computerChoice) {

        final String PAPER_WINS = " paper covers rock";
        final String ROCK_WINS = " rock smashes scissors";
        final String SCISSORS_WINS = " scissors cut paper";
        final String TIE = " you chose the same as the computer";

        // TODO Return one of the above messages depending on what playerChoice and computerChoice are.
        if (playerChoice==computerChoice){
            return TIE;
        } else if ((playerChoice == 1 || computerChoice == 1) && (playerChoice == 2 || computerChoice == 2)) {
            return PAPER_WINS;
        } else if ((playerChoice == 1 || computerChoice == 1) && (playerChoice == 3 || computerChoice == 3)){
            return ROCK_WINS;
        } else if ((playerChoice == 3 || computerChoice == 3) && (playerChoice == 2 || computerChoice == 2)){
            return SCISSORS_WINS;
        }

        return null;
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        RockPaperScissors ex = new RockPaperScissors();
        ex.start("");

    }
}
