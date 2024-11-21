public class trycatch {
    public static void main(String[] args) {
        int age = 18;
        checkAge(age);

        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[1]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    private static void checkAge(int age) {
    }

}
