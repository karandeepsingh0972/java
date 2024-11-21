import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class swingpractise {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(250, 400);
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("NAME :");
        label1.setFont(new Font("ariel", Font.PLAIN, 24));
        label1.setBounds(130, 100, 100, 40);
        JLabel label2 = new JLabel("Rollno :");
        label2.setFont(new Font("ariel", Font.PLAIN, 24));
        JLabel label3 = new JLabel("Address :");
        label3.setFont(new Font("ariel", Font.PLAIN, 24));
        JLabel label4 = new JLabel("Submit ");
        label4.setFont(new Font("ariel", Font.PLAIN, 24));

        JButton btn1 = new JButton("  ");
        JButton btn2 = new JButton("  ");
        JButton btn3 = new JButton("  ");
        JButton btn4 = new JButton("  ");

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setPreferredSize(new Dimension(250, 400));
        panel.setLayout(new FlowLayout());

        panel.add(label1);
        panel.add(btn1);
        panel.add(label2);
        panel.add(btn2);
        panel.add(label3);
        panel.add(btn3);
        panel.add(label4);
        panel.add(btn4);

        frame.add(label1);
        frame.add(btn1);
        frame.add(label2);
        frame.add(btn2);
        frame.add(label3);
        frame.add(btn3);
        frame.add(panel);
        frame.add(label4);
        frame.add(btn4);
        frame.setSize(300, 200);

        frame.setVisible(true);

    }

}
