import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

public class signup {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBounds(250, 150, 300, 200);

        JLabel label = new JLabel("Name");
        JLabel label2 = new JLabel("First Name");
        JLabel label3 = new JLabel("Email");

        JLabel title = new JLabel("Sign up Form");

        title.setBounds(250, 80, 300, 50);
        title.setFont(new Font("Ariel", Font.BOLD, 24));

        JTextField textField = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        title.setForeground(Color.blue);
        JButton btn = new JButton("Send");
        btn.setBackground(Color.black);
        btn.setForeground(Color.red);
        btn.setForeground(Color.white);

        panel.add(label);
        panel.add(textField);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(btn);
        frame.add(title);
        frame.add(panel);

        frame.setVisible(true);
    }
}