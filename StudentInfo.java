public class StudentInfo {
    String studentName;
    int studentAge;

    public StudentInfo() {
        studentName = "Not Assigned";
        studentAge = 10 ;
    }

    public StudentInfo(String name) {
        this.studentName = name;
        studentAge = 17;
    }

    public StudentInfo(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
    }

    void display() {
        System.out.println("Student Name: " + studentName + ", Age: " + studentAge);
    }
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo("Riya");
        StudentInfo s3 = new StudentInfo("Karan", 19);

        s1.display();
        s2.display();
        s3.display();
    }
}
