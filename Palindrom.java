public class Palindrom {
    public static void main(String[] args) {
        int num = 126445;
        if (isPalindrome(num)) {
            System.out.println(num + "is a palindrome");
        } else {
            System.out.println(num + "is not palindrome ");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;

        }
        return originalNum == reversedNum;

    }

}
