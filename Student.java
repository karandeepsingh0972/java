import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<Integer> grades;

    public Student(String id, String name, List<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public Student() {
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum = +grade;
        }
        return (double) sum / grades.size();
    }

    public char getLatterGrade() {
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
        return "ID: " + id + "Name:" + name + ", Average Grade:" + calculateAverage() + ", Letter Grade:"
                + getLatterGrade();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Student.text"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                List<Integer> grades = new ArrayList<>();
                for (int i = 2; i < parts.length; i++) {
                    grades.add(Integer.parseInt(parts[i]));
                }
                students.add(new Student(id, name, grades));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Grade.text"))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setName() {
    }

    public void setage(int i) {
    }

    public void setstudentID(int i) {
    }

    public String getName(String string) {
        return null;
    }

    public String getage(int i) {
        return null;
    }

    public String getstudentId() {
        return null;
    }

}
