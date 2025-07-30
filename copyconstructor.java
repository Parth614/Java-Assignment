public class copyconstructor {
    String name;
    int issueCount;

    public copyconstructor(String name, int issueCount) {
        this.name = name;
        this.issueCount = issueCount;
    }
    public copyconstructor(copyconstructor m) {
        this.name = m.name;
        this.issueCount = m.issueCount;
    }

    void display() {
        System.out.println("Magazine Name: " + name + ", Issue Count: " + issueCount);
    }

    public static void main(String[] args) {
        copyconstructor m1 = new copyconstructor("Tech Monthly", 12);
        copyconstructor m2 = new copyconstructor(m1); 

        m1.display();
        m2.display();
    }
}
