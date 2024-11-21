// public class Polymorphism {

// class CubeArea {
// double area(int x) {
// return 6 * x * x;
// }
// }

// class SphereArea {
// double area(int x) {
// return 4 * Math.PI * x * x;
// }
// }

// class CylinderArea {
// double area(int x, int y) {
// return Math.PI * x * x * y;
// }
// }

// static class Overloading {
// public static void main(String[] args) {
// Polymorphism polymorphism = new Polymorphism();
// CubeArea ca = polymorphism.new CubeArea();
// SphereArea sa = polymorphism.new SphereArea();
// CylinderArea cia = polymorphism.new CylinderArea();

// System.out.println("Surface area of cube = " + ca.area(1));
// System.out.println("Surface area of sphere = " + sa.area(2));
// System.out.println("Surface area of cylinder = " + cia.area(3, 4));
// }
// }
// }
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;

    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(4, 9));
        System.out.println(cal.add(5.6, 6.8));
        System.out.println(cal.add("hello", "karan"));
    }
}