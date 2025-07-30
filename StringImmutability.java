public class StringImmutability {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = str;

        str = str + " Programming";

        System.out.println("str: " + str);
        System.out.println("str2: " + str2); 
    }
}
