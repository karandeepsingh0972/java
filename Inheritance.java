class Animal {
    void habit() {
        System.out.println("I am nocturnal!!");
    }
}

class Mammal extends Animal {
    void nature() {
        System.out.println("I hang upside down!!");
    }
}

class Bat extends Mammal {
    void hobby() {
        System.out.println("I fly!!");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Bat b = new Bat();
        b.hobby();
        b.nature();
        b.habit();
    }
}
