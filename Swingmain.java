import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// public class Swingmain {
//     public static void main(String[] args) {

//         JFrame frame = new JFrame();
//         frame.setTitle("JFrame title goes here");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setResizable(false);
//         frame.getContentPane().setBackground(Color.green);

//         frame.setSize(420, 420);
//         frame.setVisible(true);
//     }

// }
public class Swingmain {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Bro do you even code");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);

        ImageIcon image = new ImageIcon("team-logo.png");
        frame.setIconImage(image.getImage());

    }
}
