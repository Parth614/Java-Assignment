import java.util.*;

public class RemoveDuplicatenos {
    public static void main(String[] args) {
        int[] arr = {104, 200, 200, 30, 400, 400, 504};

        // Using LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr)
            set.add(num);

        System.out.println("Array after removing duplicates:");
        for (int num : set)
            System.out.print(num + " ");
    }
}
