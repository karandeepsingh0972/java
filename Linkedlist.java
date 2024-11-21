import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> Animals = new LinkedList<>();
        Animals.add("COW");
        Animals.add("DOG");
        Animals.add("LION");
        Animals.add("GOAT");
        System.out.print("LinkedList :" + Animals);
        // add element
        Animals.add(1, "HORSE");
        System.out.println("Add LinkList:" + Animals);
        // remove element
        String str1 = Animals.remove(1);
        System.out.println("Remove form LinkedList ;" + Animals);
        // change element
        Animals.set(1, "sheep");
        System.out.println("Change Element from LinkedList :" + Animals);
        // index element
        String str2 = Animals.get(2);
        System.out.println("Element of Index :" + Animals);

    }

}
