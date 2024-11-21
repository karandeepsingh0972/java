import java.util.Scanner;

public class SimpleATM {

    private static final int PIN = 1234; // Example PIN for ATM
    private static double balance = 0.0; // Initial balance
    private static final double GST_RATE = 0.02;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PIN verification
        if (!verifyPin(scanner)) {
            System.out.println("Incorrect PIN. Exiting...");
            scanner.close();
            return;
        }

        // Main menu loop
        boolean running = true;
        while (running) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Succesfully...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static boolean verifyPin(Scanner scanner) {
        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();
        return enteredPin == PIN;
    }

    private static void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            double gstAmount = amount * GST_RATE;
            double totalAmount = amount + gstAmount;
            if (totalAmount <= balance) {
                balance -= totalAmount;
                System.out.println("Successfully withdrew $" + amount);
                System.out.println("GST (2%) applied: $" + gstAmount);
                System.out.println("Total amount deducted: $" + totalAmount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }
}
