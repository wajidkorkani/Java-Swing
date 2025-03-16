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
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
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
        frame.getContentPane().add(btn0);
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);
        frame.getContentPane().add(btn3);
        frame.getContentPane().add(btn4);
        frame.getContentPane().add(btn5);
        frame.getContentPane().add(btn6);
        frame.getContentPane().add(btn7);
        frame.getContentPane().add(btn8);
        frame.getContentPane().add(btn9);

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
