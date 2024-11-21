public class AgeValidator {
    // Method to validate age
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        // Age is valid
        System.out.println("Age is valid: " + age);
    }
}
