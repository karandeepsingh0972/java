public class InvalidAgeException extends Exception {
    // Constructor with a message
    public InvalidAgeException(String message) {
        super(message);
    }

    // Constructor with a message and cause
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
