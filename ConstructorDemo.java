class Student {
    String name;
    int rollNo;
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Parth", 101);
        s1.display();
    }
}
