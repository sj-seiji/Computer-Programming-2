/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M10: Binary I/O Lab
 */

import javax.swing.*;
import java.io.*;


public class BinaryDemo {
    public static void main(String[] args) {
        String fileName = "name.txt"; //txt file
        String names[] = {"Mordecai", "Rigby", "Skips", "Benson", "Mitch"}; //array of names
        String nameList = "";
        String listActors = "";
        int numOfActors;

        try {
            //output stream, writing to file
            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fileName));
            for(int i = 0; i < 5;i++){
                nameList += names[i] + ", "; //list out names in the array
            }
            byte[] b = nameList.getBytes();
            bout.write(b);
            bout.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            //input stream, reading
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
            while((numOfActors = bin.read()) != -1){
                listActors += ((char) numOfActors);
            }
            bin.close();
            //display list of names via pop-up window
            JOptionPane.showMessageDialog(null, "List of Names: \n" + listActors);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}