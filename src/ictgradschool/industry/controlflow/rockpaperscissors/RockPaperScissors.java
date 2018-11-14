package ictgradschool.industry.controlflow.rockpaperscissors;


import ictgradschool.Keyboard;

/**
 A game of Rock, Paper Scissors
 */
public class RockPaperScissors {

    public static final int ROCK = 1;
    public static final int PAPPER = 2;
    public static final int SCISSORS = 3;


    //  Make similar constants for PAPER and SCISSORS, to improve readability of your code.

    public void start() {

        // TODO Write your code here which calls your other methods in order to play the game. Implement this

        String playerName = getPlayerName();

        System.out.println("1. Rock \n2. Paper \n3. Scissors \n4. Quit");

        String playerChoice = getPlayerChoice();
        displayPlayerChoice(playerName,playerChoice);

        String computerChoice = getComputerChoice();
        displayPlayerChoice("Computer",computerChoice);

        // as detailed in the exercise sheet.
    }

    public String getPlayerName(){
        System.out.print("Hi! What is your name? ");
        String playerName = Keyboard.readInput();
        return playerName;
    }


    public String getPlayerChoice(){
        System.out.print("Enter choice: ");
        String playerChoice = Keyboard.readInput();
        playerChoice = makeChoice(playerChoice);
        return playerChoice;
    }

    public String makeChoice(String num){
        switch (num){
            case "1":
                num = "rock";
                break;
            case "2":
                num = "paper";
                break;
            case "3":
                num = "scissors";
                break;
            case "4":
                break;

        }
        return num;
    }


    public void displayPlayerChoice(String name, String choice) {
        //  This method should print out a message stating that someone chose a particular thing (rock, paper or scissors)
        System.out.println(name + " chose " + choice + ".");
    }


    private String getComputerChoice(){
        String computerChoice = ""+ (int)((Math.random()*3)+1);

        computerChoice = makeChoice(computerChoice);
        return computerChoice;
    }



    public boolean userWins(int playerChoice, int computerChoice) {
        // TODO Determine who wins and return true if the player won, false otherwise.

        return false;
    }

    public String getResultString(int playerChoice, int computerChoice) {

        final String PAPER_WINS = "paper covers rock";
        final String ROCK_WINS = "rock smashes scissors";
        final String SCISSORS_WINS = "scissors cut paper";
        final String TIE = " you chose the same as the computer";

        // TODO Return one of the above messages depending on what playerChoice and computerChoice are.
        return null;
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        RockPaperScissors ex = new RockPaperScissors();
        ex.start();

    }
}
