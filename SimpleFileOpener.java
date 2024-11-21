import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Desktop;
import java.io.IOException;
import java.awt.FlowLayout;

public class SimpleFileOpener {

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Simple File Opener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Create a JPanel to hold the button
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JButton
        JButton button = new JButton("Open File");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a JFileChooser
                JFileChooser fileChooser = new JFileChooser();

                // Show the file chooser dialog
                int result = fileChooser.showOpenDialog(frame);

                // Open the file if a file was selected
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    try {
                        Desktop.getDesktop().open(selectedFile);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
