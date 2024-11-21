class Array {

    public static void main(String[] args) {

        // an array of numbers
        int[] number = { 3, 6, 5, 6, 0, 12 };
        int sum = 0;

        for (int n : number) {
            sum += n;
        }
        System.out.println("sum = " + sum);

        // create an array
        int[] number2 = { 3, 5, 9, 4 };

        // for each loop
        for (int n : number2) {
            System.out.println(n);
        }
        int[] number3 = { 77, 9, 76, 34 };

        for (int n : number3) {
            System.out.println(n);
        }
    }
}
