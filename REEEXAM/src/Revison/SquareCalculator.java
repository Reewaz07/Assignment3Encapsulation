package Revison;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Square Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create a label for instructions
        JLabel instructionLabel = new JLabel("Enter a number:");

        // Create a text field for input
        JTextField numberField = new JTextField(10);

        // Create a button to calculate the square
        JButton calculateButton = new JButton("Calculate Square");

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the number from the text field
                    String text = numberField.getText();
                    double number = Double.parseDouble(text);

                    // Calculate the square
                    double square = number * number;

                    // Display the result
                    resultLabel.setText("Result: " + square);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        // Add components to the frame
        frame.add(instructionLabel);
        frame.add(numberField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Display the frame
        frame.setVisible(true);
    }
}
