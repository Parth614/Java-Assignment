import java.util.Scanner;

public class MathOperations {
    
    public static int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x= sc.nextInt();
        System.out.println("enter a number");
        int y= sc.nextInt();
        System.out.println("Addition: " + MathOperations.add(x,y));

        MathOperations obj = new MathOperations();
        System.out.println("Multiplication: " + obj.multiply(x,y));
    }
}
