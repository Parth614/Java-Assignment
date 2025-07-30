class Parent {
    void display() {
        System.out.println("Display from Parent class");
    }
}
class Child extends Parent {
    void display() {
        super.display(); // calls parent class method
        System.out.println("Display from Child class");
    }
}
public class OverrideSuperExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

