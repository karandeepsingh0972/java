public class Constructor {

    // Properties (fields) of the class
    private String name;
    private int age;

    // Constructor to initialize properties
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create a new Person object using the constructor
        Constructor constructor = new Constructor("Alice", 30);

        // Display the person's information
        constructor.displayInfo();

        // Modify and display updated information
        constructor.setName("Bob");
        constructor.setAge(35);
        constructor.displayInfo();
    }
}
