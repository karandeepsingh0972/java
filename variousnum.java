import java.util.Scanner;

public class variousnum {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a number : ");
            int num = sc.nextInt();
            int x = 171, y, sum = 0;
            System.out.print("Input the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Input the second number: ");
            int num2 = sc.nextInt();
            int sum_num1 = 0, sum_num2 = 0;

            while (x > 0) {
                y = x % 10;
                sum = sum + y;
                x = x / 10;
            }
            if (num % sum == 0)
                System.out.println(num + " is a Harshad Number.");
            else
                System.out.println(num + " is not a Harshad Number.");
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0)
                    sum_num1 += i;
            }
            for (int i = 1; i <= num2; i++) {
                if (num2 % i == 0)
                    sum_num2 += i;
            }
            if (sum_num1 == sum_num2)
                System.out.println("These numbers are amicable.");
            else
                System.out.println("These numbers are not amicable.");
        }

        System.out.println("\n");
    }
}
