public class operatorPrecedence {
    public static void main(String[] args) {
        int a = 20, b = 9, c = 12;
        int result1 = a + b * c;     
        int result2 = (a + b) * c;   

        System.out.println("Result of a + b * c = " + result1);      
        System.out.println("Result of (a + b) * c = " + result2);     

        boolean result3 = a > b && b > c; 
        System.out.println("Result of a > b && b > c = " + result3); 

        boolean result4 = a > b || b < c && c < a; 
        System.out.println("Result of a > b || b < c && c < a = " + result4);
    }
}
