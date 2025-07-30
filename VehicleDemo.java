
class Vehicle {
    private String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void start() {
        System.out.println(brand + " vehicle is starting...");
    }
    
    public String getBrand() {
        return brand;
    }
}


class Car extends Vehicle {
    private int numDoors;
    
    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }
    
    public void openDoors() {
        System.out.println(getBrand() + " car is opening its " + numDoors + " doors");
    }
}


class SportsCar extends Car {
    private int maxSpeed;
    
    public SportsCar(String brand, int numDoors, int maxSpeed) {
        super(brand, numDoors);
        this.maxSpeed = maxSpeed;
    }
    
    public void race() {
        System.out.println(getBrand() + " sports car is racing at " + maxSpeed + " km/h!");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Generic");
        Car car = new Car("Toyota", 4);
        SportsCar sportsCar = new SportsCar("Ferrari", 2, 320);
        
        
        System.out.println("--- Vehicle ---");
        vehicle.start();
        
        System.out.println("\n--- Car ---");
        car.start();        
        car.openDoors();    
        
        System.out.println("\n--- SportsCar ---");
        sportsCar.start();      
        sportsCar.openDoors();  
        sportsCar.race();       
        
        
        System.out.println("\n--- Polymorphism Example ---");
        Vehicle mySportsCar = new SportsCar("Lamborghini", 2, 350);
        mySportsCar.start();    
        
        if (mySportsCar instanceof SportsCar) {
            ((SportsCar)mySportsCar).race();
        }
    }
}
