
interface Walkable {
    void walk();
    
    default void speed() {
        System.out.println("Walking at normal speed");
    }
}


interface Swimmable {
    void swim();
    
    default void speed() {
        System.out.println("Swimming at normal speed");
    }
}

class Amphibian implements Walkable, Swimmable {
    // Implementing walk() from Walkable
    @Override
    public void walk() {
        System.out.println("Amphibian is walking on land");
    }
    
    
    @Override
    public void swim() {
        System.out.println("Amphibian is swimming in water");
    }
    
   
    @Override
    public void speed() {
        System.out.println("Amphibian adjusting speed...");
        Walkable.super.speed(); 
        Swimmable.super.speed(); 
    }
    
   
    public void habitat() {
        System.out.println("Amphibian lives both on land and in water");
    }
}


public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Amphibian frog = new Amphibian();
        
        frog.walk();
        
        frog.swim();
        
        frog.speed();
        
        frog.habitat();
    }
}