public class Worker {
    public static void main(String[] args) {
        if (args.length > 0) {
            int number = Integer.parseInt(args[0]);
            System.out.println("Worker processing number: " + number);
            // Simulate some computation
            double result = Math.sqrt(number * 2.0);
            System.out.println("Result from Worker: " + result);
        }
    }
}
