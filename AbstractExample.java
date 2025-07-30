abstract class Shape {
    abstract void draw(); // abstract method

    void info() {
        System.out.println("This is a shape of four side.");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Rectangle c = new Rectangle();
        c.draw();
        c.info();
    }
}
