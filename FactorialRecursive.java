import java.util.Scanner;

public class FactorialRecursive {

    
    static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);
        if (result != -1) {
            System.out.println("Factorial of " + num + " is: " + result);
        }
        

        sc.close();
    }
}
