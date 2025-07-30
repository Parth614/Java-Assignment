class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }
}
public class Animal_hierarchy {
    public static void main(String[] args) {
    
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();
        a1.makeSound();  
        a2.makeSound();  
        a3.makeSound();  
        a1.eat();
        a2.eat();
        a3.eat();
    }
}

