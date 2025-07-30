import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (num <= 1)
            System.out.println("Not prime");
        else if (isPrime)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");

        sc.close(); // Good practice
    }
}
