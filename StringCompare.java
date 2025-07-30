public class StringCompare {
    public static void main(String[] args) {
        String str1 = new String("Good Morning");
        String str2 = new String("Good Morning");

        System.out.println("Using == : " + (str1 == str2)); 
        System.out.println("Using equals() : " + str1.equals(str2));

        String str3 = "Namaste";
        String str4 = "Namaste";

        System.out.println("Using == with literals : " + (str3 == str4)); 
        System.out.println("Using equals() with literals : " + str3.equals(str4)); 
    }
}
