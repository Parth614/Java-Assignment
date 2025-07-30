class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class PolymorphismEg {
    public static void main(String[] args) {
        Animal ref;
        ref = new Dog(); 
        ref.sound();
        ref = new Cat(); 
        ref.sound();
    }
}
