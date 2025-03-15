import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Swing Example");
        frame.setLayout(new FlowLayout());

        // Create UI components
        JButton button = new JButton("Add");
        JLabel label = new JLabel("Result: ");
        JTextField inputOne = new JTextField(20);
        JTextField inputTwo = new JTextField(20);
        JTextField inputThree = new JTextField(20);

        // Set the inputThree field to be non-editable (just for displaying the result)
        inputThree.setEditable(false);

        // Add components to the frame
        frame.getContentPane().add(inputOne);
        frame.getContentPane().add(inputTwo);
        frame.getContentPane().add(button);
        frame.getContentPane().add(label);
        frame.getContentPane().add(inputThree);

        // Add action listener to the button
        button.addActionListener(ae -> {
            double num1 = Double.parseDouble(inputOne.getText());
            double num2 = Double.parseDouble(inputTwo.getText());
            inputThree.setText(String.valueOf(num1 + num2));
        });

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the frame size
        frame.setSize(300, 200);

        // Display the window
        frame.setVisible(true);
    }
}
