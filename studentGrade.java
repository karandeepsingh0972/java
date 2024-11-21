import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class studentGrade {
    private String id;
    private String name;
    private List<Integer> grades;

    public studentGrade(String id, String name, List<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade; // Fix: use += to accumulate sum
        }
        return (double) sum / grades.size();
    }

    public char getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else
            return 'F';
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Average Grade: " + calculateAverage() + ", Letter Grade: "
                + getLetterGrade();
    }

    public static void main(String[] args) {
        List<studentGrade> students = new ArrayList<>();

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0].trim();
                String name = parts[1].trim();
                List<Integer> grades = new ArrayList<>();
                for (int i = 2; i < parts.length; i++) {
                    grades.add(Integer.parseInt(parts[i].trim()));
                }
                students.add(new studentGrade(id, name, grades));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Grade.txt"))) {
            for (studentGrade student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
