// Write a program using swing components to find the factorial of a number.
// Use text fields for inputs

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator extends JFrame {
    private JTextField inputField;
    private JTextField outputField;
    private JButton calculateButton;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 1));

        inputField = new JTextField("Enter a number");
        add(inputField);

        outputField = new JTextField("Factorial will be displayed here");
        outputField.setEditable(false);
        add(outputField);

        calculateButton = new JButton("Calculate Factorial");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    long factorial = 1;
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }
                    outputField.setText("Factorial of " + number + " is " + factorial);
                } catch (NumberFormatException ex) {
                    outputField.setText("Please enter a valid number");
                }
            }
        });
        add(calculateButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FactorialCalculator();
    }
}
