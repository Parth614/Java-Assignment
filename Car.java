public class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
    public static void main(String[] args) {
        Car car = new Car("Maruti Suzuki", 2024);
        car.display();
    }
}
