public class Sum {
    public static void main(String[] args) {
        System.out.println("i am main function...");
        Sum_the_num(4, 10);
        division_the_num(56, 9);
        multipy_the_num(15, 9);

    }

    public static int Sum_the_num(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
        return sum;
    }

    public static int division_the_num(int x, int y) {
        int division = x / y;
        System.out.println(division);
        return (division);

    }

    public static int multipy_the_num(int x, int y) {
        int multipy = x * y;
        System.out.println(multipy);
        return (multipy);
    }

}
