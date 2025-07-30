class Person {
    String name;
    Person(String name) {
        this.name = name;  
    }

    void displayInfo() {
        System.out.println("Person Name: " + name);
    }
}
class Student extends Person {
    int rollNo;
    String name; 

    Student(String name, int rollNo) {
        super(name);           
        this.name = name;      
        this.rollNo = rollNo; 
    }
    void showDetails() {
        System.out.println("Student Name (this.name): " + this.name);
        System.out.println("Person Name (super.name): " + super.name);
        System.out.println("Roll Number: " + rollNo);
    }

    void displayInfo() {
        super.displayInfo();   
        System.out.println("This is overridden in Student class.");
    }
}
public class TestThisSuper {
    public static void main(String[] args) {
        Student s = new Student("Aman", 101);
        s.showDetails();
        System.out.println();
        s.displayInfo();
    }
}
