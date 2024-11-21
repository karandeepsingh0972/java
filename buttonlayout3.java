import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class buttonlayout3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        frame.add(label1);
        frame.add(btn1);
        frame.add(label2);
        frame.add(btn2);

        frame.setVisible(true);

    }

}
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import java.awt.FlowLayout;
// import java.awt.Dimension;
// import java.awt.Color;

// public class buttonlayout3 {

// public static void main(String[] args) {
// // Create a JFrame instance
// JFrame frame = new JFrame("FlowLayout Example");
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setSize(400, 200);
// frame.setLocationRelativeTo(null);

// // Create a JPanel with FlowLayout
// JPanel panel = new JPanel();
// panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Center
// alignment, 10px horizontal and vertical
// // gaps
// panel.setBackground(Color.LIGHT_GRAY);

// // Create some JLabels and JButtons
// JLabel label1 = new JLabel("Label 1");
// JLabel label2 = new JLabel("Label 2");
// JLabel label3 = new JLabel("Label 3");

// JButton button1 = new JButton("Button 1");
// JButton button2 = new JButton("Button 2");
// JButton button3 = new JButton("Button 3");

// // Add components to the JPanel
// panel.add(label1);
// panel.add(button1);
// panel.add(label2);
// panel.add(button2);
// panel.add(label3);
// panel.add(button3);

// // Add the JPanel to the JFrame
// frame.add(panel);

// // Make the JFrame visible
// frame.setVisible(true);
// }
// }
