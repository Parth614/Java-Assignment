/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Vehicle {
    void start();      
    void stop();       
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting with a key.");
    }

    public void stop() {
        System.out.println("Car has stopped using brakes.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with a self-starter.");
    }

    public void stop() {
        System.out.println("Bike has stopped using disc brakes.");
    }
}
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        System.out.println();

        v2.start();
        v2.stop();
    }
}
