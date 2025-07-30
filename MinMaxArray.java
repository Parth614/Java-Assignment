public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 22, 3, 15};
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
