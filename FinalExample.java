class Base {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Derived extends Base {
    // void show() {} 
    void display() {
        System.out.println("Derived class method");
    }
}
public class FinalExample {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();   
        d.display(); 
    }
}
