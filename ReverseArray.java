public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {11, 45, 23, 340, 90};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

