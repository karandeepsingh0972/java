import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.BorderLayout;

public class DirectoryViewer {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Directory Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        // Create components
        JButton selectButton = new JButton("Select Directory");
        JTextArea fileArea = new JTextArea();
        fileArea.setEditable(false); // Make the text area read-only
        JScrollPane scrollPane = new JScrollPane(fileArea); // Add scroll pane for scrolling

        // Set layout for the frame
        frame.setLayout(new BorderLayout());
        frame.add(selectButton, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add action listener to the button
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Restrict selection to directories
                                                                                 // only
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedDir = fileChooser.getSelectedFile();
                    displayFilesAndFolders(selectedDir, fileArea);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to display files and folders in the text area
    private static void displayFilesAndFolders(File directory, JTextArea fileArea) {
        File[] files = directory.listFiles(); // Get list of files and folders
        if (files != null) {
            fileArea.setText(""); // Clear previous contents
            for (File file : files) {
                fileArea.append(file.getAbsolutePath() + (file.isDirectory() ? " (Folder)" : " (File)") + "\n");
            }
        } else {
            fileArea.setText("The selected directory is empty or could not be accessed.");
        }
    }
}
