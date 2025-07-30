import java.util.Scanner;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if-else
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        System.out.print("Enter day number (1-3): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day"); break;
        }

        // for loop
        System.out.println("First 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
