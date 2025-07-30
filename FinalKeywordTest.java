final class FinalClass {
    final int finalVar = 100;

    final void show() {
        System.out.println("Final method, finalVar: " + finalVar);
    }
}

public class FinalKeywordTest {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
        
    }
}
