public class Customexceptoin {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        // Test with different age values
        int[] testAges = { 25, 15, -1 };

        for (int age : testAges) {
            try {
                System.out.println("Testing age: " + age);
                validator.validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Caught InvalidAgeException: " + e.getMessage());
                // Optionally, handle the exception, e.g., logging
            }
        }
    }
}
