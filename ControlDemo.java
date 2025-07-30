import java.util.Scanner;

public class ControlDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if-else demo
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        // switch demo
        System.out.print("Enter a day number (1 to 3): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // for loop demo
        System.out.println("First 5 natural numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
