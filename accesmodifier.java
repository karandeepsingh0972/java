public class accesmodifier {
    void message() {
        System.out.println("This is a message");
    }

    class Data {
        // private variable
        private String name;

        // getter and setter for private variable
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        accesmodifier am = new accesmodifier();
        Data d = am.new Data();
        // access private variable and field from another cl using getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}

class Animal {

    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        // create an object of Dog cl
        Dog dog = new Dog();
        // access protected method
        dog.display();
    }
}