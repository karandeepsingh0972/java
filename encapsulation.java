public class encapsulation {
    public static class Student {
        // Private attributes (data)
        private String name;
        private int age;
        private int studentId;

        // Public methods (functions) to access and manipulate the attributes
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public static void main(String[] args) {
            // Create a new Student object
            Student student = new Student();

            // Set the student's details
            student.setName("John Doe");
            student.setAge(20);
            student.setStudentId(12345);

            // Print the student's details
            System.out.println("Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Student ID: " + student.getStudentId());
        }
    }

}
