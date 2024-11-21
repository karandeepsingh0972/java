// abstract class Bike {
// Bike() {
// System.out.println("The Street Bob. ");
// }

// abstract void drive();

// void weight() {
// System.out.println("Light on its feet with a hefty : 630 lbs.");
// }
// }

// class HarleyDavidson extends Bike {
// void drive() {
// System.out.println("Old-school yet relevant.");
// }
// }

// class Abstraction {
// public static void main(String args[]) {
// Bike obj = new HarleyDavidson();
// obj.drive();
// obj.weight();
// }
// }
// abstract class Vehical {
//     abstract void start();

//     void stop() {
//         System.out.println("vehical stopped");
//     }
// }

// class Car extends Vehical {
//     void start() {
//         System.out.println("Car started");
//     }
// }

// class bike extends Vehical {
//     void start() {
//         System.out.println("bike started");
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         bike myBike = new bike();
//         myCar.start();
//         myCar.stop();

//         myBike.stop();
//         myBike.start();

//     }
// }
interface Animal {
    void makesound();

    void eat();
}

class Dog implements Animal {
    public void makesound() {
        System.out.println("woof woof");
    }

    public void eat() {
        System.out.println("dog is eating");
    }
}

class Cat implements Animal {
    public void makesound() {
        System.out.println("meow  meow");
    }

    public void eat() {
        System.out.println("cat is eating");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makesound();
        myDog.eat();

        myCat.makesound();
        myCat.eat();

    };
}
