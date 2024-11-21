import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "mango");
        System.out.println("original List:");
        list.forEach(fruit -> System.out.println(fruit));

        System.out.println("/n list in uppercase");
        list.forEach(fruit -> System.out.println(fruit.toUpperCase()));

        System.out.println("/n fruit are start with 'a'");
        list.forEach(fruit -> {
            if (fruit.startsWith("a")) {
                System.out.println(fruit);
            }
        });
        System.out.println("fruit length");
        list.forEach(fruit -> System.out.println(fruit + " " + fruit.length()));

    }
}
