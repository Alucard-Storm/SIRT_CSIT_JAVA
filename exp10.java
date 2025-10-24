// Write a program to create an application using concept of swing

import javax.swing.*; // Importing Swing components
import java.awt.event.*; // Importing event handling classes

public class exp10 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Experiment 10");
        frame.setSize(300, 200); // Set the size of the window
        frame.setLayout(null); // Set layout to null
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a button
        JButton button = new JButton("Click here");
        button.setBounds(100, 80, 100, 30); // Set button position and size
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Thank You!");
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button);
        frame.setVisible(true); // Make the frame visible
    }
}