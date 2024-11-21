import java.util.Scanner;

public class Calcutalor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter your scond number:");
        double num2 = scanner.nextDouble();

        System.out.println("choose your operation:+,-,*,/");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean validoperation = true;

        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Eror: cannot divide by zero");
                    validoperation = false;
                }
                break;
            default:
                System.out.println("error :invalid in operation");
                validoperation = false;
                break;
        }
        if (validoperation) {
            System.out.println("the result is:" + result);
        }
        scanner.close();
    }

    // method od add
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;

    }
}
