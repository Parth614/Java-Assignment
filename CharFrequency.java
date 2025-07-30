public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        int[] freq = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
}
