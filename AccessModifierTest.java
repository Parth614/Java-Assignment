class AccessDemo {
    public int pubVar = 10;
    private int priVar = 20;
    protected int proVar = 30;
    int defVar = 40;  // default access

    public void showAll() {
        System.out.println("Public: " + pubVar);
        System.out.println("Private: " + priVar);
        System.out.println("Protected: " + proVar);
        System.out.println("Default: " + defVar);
    }
}

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.showAll();
        System.out.println("Accessing public: " + obj.pubVar);
        
    }
}
