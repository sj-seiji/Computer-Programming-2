/**
 * Seiji Zapanta
 * Wenjia Li
 * CSCI 185
 * December 6, 2022
 * M7: Develop More Advanced Java GUI Lab
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeasurementUnitConvertor extends JFrame {
    public MeasurementUnitConvertor(){
        super("Measurement Unit Convertor");
        setSize(400,300);
        setLocation(550,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //code termination

        Container container = getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel subHeading = new JLabel("pounds to kg ");
        subHeading.setBounds(30, 10, 200, 50);
        Font myFont = new Font("Dialog", Font.ITALIC, 18);
        subHeading.setFont(myFont);
        panel.add(subHeading);

        //JLabel for pound and kg
        JLabel jLabel = new JLabel("pound: ");
        jLabel.setBounds(120, 60, 100, 50);
        JLabel jLabel2 = new JLabel("kg: ");
        jLabel2.setBounds(140, 108, 100, 50);
        panel.add(jLabel);
        panel.add(jLabel2);

        //JTextField for pound and kg
        JTextField poundField = new JTextField(10);
        poundField.setBounds(180, 73, 100, 25);
        JTextField kgField = new JTextField(10);
        kgField.setBounds(180, 120, 100, 25);
        panel.add(poundField);
        panel.add(kgField);
        container.add(panel);

        //JLabel for error
        JLabel errorField = new JLabel();
        errorField.setBounds(145, 160, 250, 25);
        panel.add(errorField);

        //convert button
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(70, 200, 75, 40);
        convertButton.setForeground(Color.BLUE);
        panel.add(convertButton);
        //actionLister for the convert button
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evnt) {
                try{
                    double pound = Double.parseDouble(poundField.getText());
                    double kg = pound * 0.454;
                    kgField.setText(String.valueOf(kg));
                } catch (Exception e){
                    errorField.setText("Enter only number!");
                }

            }

        });

        //clear button
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(250, 200, 75, 40);
        clearButton.setForeground(Color.RED);
        panel.add(clearButton);
        //actionListener for the clear button
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evnt){
                poundField.setText("");

            }
        });
    }
    //main method to run the program
    public static void main(String[] args) {
        MeasurementUnitConvertor convert = new MeasurementUnitConvertor();
        convert.setVisible(true); //show
    }
}
