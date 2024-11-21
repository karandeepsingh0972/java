import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class FileChooserExample {

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("File Chooser Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Create a JPanel to hold the button
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JButton
        JButton button = new JButton("Select file ");

        JLabel filePathLabel = new JLabel("No file selected");
        panel.add(filePathLabel);

        JButton deleteFileButton = new JButton("Delete File");
        deleteFileButton.setEnabled(false); // Disabled until a file is selected
        panel.add(deleteFileButton);

        frame.add(panel, BorderLayout.CENTER);

        final JFileChooser fileChooser = new JFileChooser();

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a JFileChooser
                JFileChooser fileChooser = new JFileChooser();

                // Show the file chooser dialog
                int result = fileChooser.showOpenDialog(frame);

                // Check if a file was selected
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    // Display the selected file path
                    JOptionPane.showMessageDialog(frame, "Selected File: " + selectedFile.getAbsolutePath());
                } else {
                    // Display a message if no file was selected
                    JOptionPane.showMessageDialog(frame, "No file selected.");
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
