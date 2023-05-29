/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M10: Text I/O Lab
 */

import javax.swing.*;
import java.util.*;
import java.io.*;

public class TextIO {
    /** Main method */
    public static void main(String[] args) {
        //creating and writing to a text file
        String fileName = "memo.txt";
        PrintWriter outputStream = null;
        System.out.println("We got a file: " + fileName);
        int max = 100;
        int min = -100;

        //outputStream, writing output to the text file
        try {
            outputStream = new PrintWriter(fileName);
        }catch (FileNotFoundException e){
            System.out.println("Error opening the file: " + fileName);
            System.exit(0);
        }
        //generate 10 numbers
        for (int i = 0; i < 10; i++) {
            outputStream.print(((int) (Math.random() * (max - min)) + min));
            outputStream.print(", ");
        }
        outputStream.close();

        //inputStream
        //creating an ArrayList
        Scanner inputStream = null;
        ArrayList<String> list = new ArrayList<>();

        try{
            inputStream = new Scanner(new File(fileName));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (inputStream.hasNext()){
            list.add(inputStream.nextLine());
            //display the generated 10 numbers
            JOptionPane.showMessageDialog(null, "10 ints generated from the " + fileName + " file: \n" + list);
        }
    }
}