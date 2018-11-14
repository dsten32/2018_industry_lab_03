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

        int playerChoice = getPlayerChoice();

        displayPlayerChoice(playerName,playerChoice);

        int computerChoice = getComputerChoice();

        displayPlayerChoice("Computer",computerChoice);

        System.out.println(userWins(playerChoice,computerChoice));


        // as detailed in the exercise sheet.
    }

    public String getPlayerName(){
        System.out.print("Hi! What is your name? ");
        return Keyboard.readInput();
    }


    public int getPlayerChoice(){
        System.out.print("Enter choice: ");
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



    public boolean userWins(int playerChoice, int computerChoice) {
        // TODO Determine who wins and return true if the player won, false otherwise.
        if (playerChoice==1 && computerChoice==2 || playerChoice==2 && computerChoice==3 || playerChoice==3 && computerChoice==1 || playerChoice == computerChoice ){
            return false;
        } else if (playerChoice==2 && computerChoice==1 || playerChoice==3 && computerChoice==2 || playerChoice==1 && computerChoice==3){
            return true;
        }

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
