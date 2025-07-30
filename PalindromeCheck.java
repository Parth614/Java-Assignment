import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string or number: ");
        String input = sc.next();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

        if (input.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

