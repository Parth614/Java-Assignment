public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 7, 8};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
