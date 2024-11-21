import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileDeleterGUI {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("File Deleter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new BorderLayout());

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a button to select the file
        JButton selectFileButton = new JButton("Select File");
        panel.add(selectFileButton);

        // Create a label to show the file path
        JLabel filePathLabel = new JLabel("No file selected");
        panel.add(filePathLabel);

        // Create a button to delete the file
        JButton deleteFileButton = new JButton("Delete File");
        deleteFileButton.setEnabled(false); // Disabled until a file is selected
        panel.add(deleteFileButton);

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Create a file chooser
        final JFileChooser fileChooser = new JFileChooser();

        // Action listener for the select file button
        selectFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    filePathLabel.setText("Selected file: " + selectedFile.getAbsolutePath());
                    deleteFileButton.setEnabled(true); // Enable delete button
                    deleteFileButton.putClientProperty("selectedFile", selectedFile);
                }
            }
        });

        // Action listener for the delete file button
        deleteFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File fileToDelete = (File) deleteFileButton.getClientProperty("selectedFile");
                if (fileToDelete != null && fileToDelete.exists()) {
                    int confirmation = JOptionPane.showConfirmDialog(frame,
                            "Are you sure you want to delete " + fileToDelete.getName() + "?",
                            "Confirm Deletion",
                            JOptionPane.YES_NO_OPTION);

                    if (confirmation == JOptionPane.YES_OPTION) {
                        if (fileToDelete.delete()) {
                            JOptionPane.showMessageDialog(frame, "File deleted successfully!");
                            filePathLabel.setText("No file selected");
                            deleteFileButton.setEnabled(false); // Disable delete button
                        } else {
                            JOptionPane.showMessageDialog(frame, "Failed to delete file.");
                        }
                    }
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
