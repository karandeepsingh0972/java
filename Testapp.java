import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Testapp {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");
        JLabel label3 = new JLabel("Label 3");

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        btn1.setBackground(Color.DARK_GRAY);

        JPanel panel = new JPanel();
        panel.setBackground(null);
        panel.setPreferredSize(new Dimension(600, 600));
        panel.setLayout(new FlowLayout());

        panel.add(label1);
        panel.add(btn1);
        panel.add(label2);
        panel.add(btn2);
        panel.add(label3);
        panel.add(btn3);

        frame.add(label1);
        frame.add(btn1);
        frame.add(label2);
        frame.add(btn2);
        frame.add(label3);
        frame.add(btn3);

        frame.add(panel);

        frame.setVisible(true);
    }
}
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.FlowLayout;

// public class Testapp {

// public static void main(String[] args) {
// // Create the main JFrame
// JFrame frame = new JFrame("Button Click Event Handling");
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setSize(300, 200);
// frame.setLocationRelativeTo(null);
// frame.setLayout(new FlowLayout());

// // Create a JPanel to hold the button
// JPanel panel = new JPanel();
// panel.setLayout(new FlowLayout());

// // Create a JButton
// JButton button = new JButton("Click Me");

// // Add an ActionListener to the button
// button.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// // Code to be executed when the button is clicked
// JOptionPane.showMessageDialog(frame, "Button Clicked!");
// }
// });

// // Add the button to the panel
// panel.add(button);

// // Add the panel to the frame
// frame.add(panel);

// // Make the frame visible
// frame.setVisible(true);
// }
// }
