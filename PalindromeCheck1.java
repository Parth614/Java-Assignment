public class PalindromeCheck1 {
    public static void main(String[] args) {
        String str = "madam";
        String b = "ganesh";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
            reversed = reversed + b.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        if (b.equals(reversed)) {
            System.out.println(b + " is a palindrome.");
        } else {
            System.out.println(b + " is not a palindrome.");
        }
        
    }
}

