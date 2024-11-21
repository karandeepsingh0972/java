import java.util.HashMap;

public class hasmap {

    private static String name;

    public static void main(String[] args) {

        HashMap<String, Integer> languages = new HashMap<>();
        HashMap<String, Integer> numbers = new HashMap<>();
        languages.put("python", null);
        System.out.println("HashMap: " + languages);
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);

        HashMap<String, Object> hashMap = new HashMap<>();

        // Store a string value
        hashMap.put("name", "john doe");

        // Store an array value
        String[] colors = { "red", "blue", "green" };
        hashMap.put("colors", colors);

        // Retrieve and print the values
        System.out.println("Name: " + hashMap.get("name"));
        System.out.println("Colors: " + java.util.Arrays.toString((String[]) hashMap.get("colors")));
        for (String key : hashMap.keySet())
            ;
        System.out.println(name + ":" + hashMap.keySet());

    }
}
