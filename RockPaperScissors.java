/**
 * Seiji Zapanta and Sri Varshini Priya Bitla
 * Wenjia Li
 * CSCI 185
 * November 11, 2022
 * M6: Introduction to Exception Handling Lab
 */


import javax.swing.*;
public class RockPaperScissors {
    public static void main(String args[]) {
        //Welcome user to the game and introducing rules
        JOptionPane.showMessageDialog(null, "Welcome to Rock, Paper, and Scissors");
        JOptionPane.showMessageDialog(null, "Let me remind you the rules first:\nScissor cuts paper, paper covers rock, and rock breaks scissors. ");
        JOptionPane.showMessageDialog(null, "0:Rock\n1:Paper\n2:Scissor");


        do {
            int yourChoice;
            int computerChoice = (int) (Math.random()*10);
            computerChoice %= 3;
            String yourInput = JOptionPane.showInputDialog("Enter your choice! It should be only 0, 1, or 2!");

            try {
                yourChoice = Integer.parseInt(yourInput);
                if (yourChoice < 0 || yourChoice > 2) {
                    JOptionPane.showMessageDialog(null, "Your choice is not valid! Please try again");
                } else {
                    if (yourChoice == computerChoice) {
                        JOptionPane.showMessageDialog(null, "It’s a Tie!");
                    } else if (computerLost(yourChoice,computerChoice)) {
                        JOptionPane.showMessageDialog(null, "It’s a Win!");
                    } else {
                        JOptionPane.showMessageDialog(null, "It’s a Lose!");
                    }
                }
                //ask if the user wants to continue playing
                JOptionPane jOptionPane = new JOptionPane(JOptionPane.YES_NO_OPTION);
                int confirmation = JOptionPane.showConfirmDialog(jOptionPane, "Do you want to end the game?");
                if (confirmation == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            //if the choice is invalid (not 0,1,2), anything inside catch will run
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Your choice is not valid! Please try again");
            }
        } while (true);
    }
    //declare when computer loses in the game
    private static boolean computerLost(int user, int computer) {
        //to check if the computer's choice beats the user
        return user == 0 && computer == 2 ||
                user == 1 && computer == 0
                || user == 2 && computer == 1;
    }
}
//Sri organized the code with the use of do while
//Seiji looked into the try and catch part of the code
//if else statements were done by both students