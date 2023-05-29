/**
 * Seiji Zapanta
 * Wenjia Li
 * CSCI 185
 * November 24, 2022
 * M7: GUI Basics Lab
 */


import javax.swing.*;
import java.awt.*;

public class UpperLowerCaseConverter extends JFrame {
    public UpperLowerCaseConverter(){
        super("Upper/Lower Case Convertor");
        setSize(400,300);
        setLocation(550,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //code termination

        //Boarder Layout
        Container content = getContentPane( );
        content.setLayout(new BorderLayout( ));

        //text field here
        JTextField text = new JTextField("Type here: ");
        text.setBackground(Color.WHITE);
        content.add(text, BorderLayout.CENTER);


        //first panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.GRAY); //set a background color for the panel
        
        //button components inside the first panel
        JButton b = new JButton("Upper");
        buttonPanel.add(b);
        JButton b1 = new JButton("Lower");
        buttonPanel.add(b1);
        JButton b2 = new JButton("Clear");
        buttonPanel.add(b2);
        //adding the buttons to the panel
        content.add(buttonPanel, BorderLayout.NORTH);


        //second panel
        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setBackground(Color.LIGHT_GRAY); //set a background color for the panel
        JButton b3 = new JButton("Save Text");
        buttonPanel1.add(b3);
        content.add(buttonPanel1, BorderLayout.SOUTH);


    }
    //main method to run the program
    public static void main(String[] args) {
        UpperLowerCaseConverter text1 = new UpperLowerCaseConverter();
        text1.setVisible(true); //show
    }
}
