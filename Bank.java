import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Bank {
    public static HashMap<Integer, Integer> accounts = new HashMap<>();
    public static double rate = 0.01;
    public static int nextacct = 0;
    public static int current = -1;
    public static Scanner scanner;
    public static boolean done = false;

    public static void main(String[] args) {
        Bank.scanner = new Scanner(System.in);
        Bank.newAccount();
        Bank.select();
        Bank.authorizeLoan();
        Bank.run();
    }

    private static void select() {
    }

    public static void run() {
        while (!done) {
            System.out.print("Enter command (0=quit, 1=new, 2=select,3=deposit, 4=loan, 5=show, 6=interest): ");
            try (Scanner scanner = new Scanner(System.in)) {
                int cmd = scanner.nextInt();
                processCommand(cmd);
            }
        }

    }

    public static void processCommand(int cmd) {
        if (cmd == 0)
            quit();
        else if (cmd == 1)
            newAccount();
        else if (cmd == 2)
            select();
        else if (cmd == 3)
            deposit();
        else if (cmd == 4)
            authorizeLoan();
        else if (cmd == 5)
            showAll();
        else if (cmd == 6)
            addInterest();
        else
            System.out.println("illegal command");
    }

    public static void quit() {
        System.out.println("Goodbye!");
    }

    private static void newAccount() {
        current = nextacct++;
        accounts.put(current, 0);
        System.out.println("Your new account number is "
                + current);
    }

    public static void deposit() {
        System.out.print("Enter deposit amount: ");
        int amt = scanner.nextInt();
        int balance = accounts.get(current);
        accounts.put(current, balance + amt);
    }

    private static void authorizeLoan() {
        System.out.print("Enter loan amount: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int loanamt = scanner.nextInt();
            int balance = accounts.get(current);
            if (balance >= loanamt / 10)
                System.out.println("Your loan is approved");
            else
                System.out.println("Your loan is denied");
        }

    }

    private static void showAll() {
        Set<Integer> accts = accounts.keySet();
        System.out.println("The bank has " + accts.size() + " accounts.");
        for (int i : accts) {
            System.out.println("\tBank account " + i + ": balance=" + accounts.get(i));
        }
    }

    private static void addInterest() {
        Set<Integer> accts = accounts.keySet();
        for (int i : accts) {
            int balance = accounts.get(i);
            int newbalance = (int) (balance * (1 + rate));
            accounts.put(i, newbalance);
        }
    }
}
