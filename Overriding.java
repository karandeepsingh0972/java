class Shape {
    void draw() {
        System.out.println("Your favorite shape");
    }

    void numberOfSides() {
        System.out.println("side = 0");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("SQUARE ");
    }

    void numberOfSides() {
        System.out.println("side = 4 ");
    }
}

class Pentagon extends Shape {
    void draw() {
        System.out.println("PENTAGON ");
    }

    void numberOfSides() {
        System.out.println("side= 5");
    }
}

class Hexagon extends Shape {
    void draw() {
        System.out.println("HEXAGON ");
    }

    void numberOfSides() {
        System.out.println("side = 6 ");
    }
}

public class Overriding {

    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        s.numberOfSides();

        Pentagon p = new Pentagon();
        p.draw();
        p.numberOfSides();

        Hexagon h = new Hexagon();
        h.draw();
        h.numberOfSides();
    }
}
