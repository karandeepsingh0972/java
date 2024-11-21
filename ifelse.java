public class ifelse {
    public static void main(String[] args) {
        int[] number = { 3, 6, 9, 12, 15, 18, 21, 24, 27 };
        for (int num : number) {
            System.out.print(num);
            if (num % 3 == 0) {
                System.out.println("The num is divisible by 3: " + num);
            } else if (num % 5 == 0) {
                System.out.println(" The Num is Divisible by 5: " + num);
            }

            else {
                System.out.println("no number is divisible by 5 or 3");
            }

        }

    }
}
