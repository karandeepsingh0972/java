public class user {
    public static void main(String[] args) {
        String email = "karandeep123@gmail.com";
        String msg1 = "Dear sir i am greatful for you for my help";
        String phone = "3495033355";

        System.out.println("this is main method ...");
        printcontactinfo(email, msg1, phone);

    }

    public static void printcontactinfo(String email, String msg1, String phone) {
        System.out.println("my email is :" + email);
        System.out.println("my message is :" + msg1);
        System.out.println("my phone number is :" + phone);

    }

}
