import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("PYTHON");
        languages.add("java");
        languages.add("html");
        System.out.println("ArrayList :" + languages);
        // Access element
        String str1 = languages.get(1);
        System.out.println("Element at index 1: " + str1);
        // change element
        languages.set(2, "JavaScript");
        System.out.println("Modified ArraayList :" + languages);
        // remove element
        String str2 = languages.remove(2);
        System.out.println("Remove fron ArrayList :" + languages);

    }
}
