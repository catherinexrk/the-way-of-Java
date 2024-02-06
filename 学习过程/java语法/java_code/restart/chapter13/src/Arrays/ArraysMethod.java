package Arrays;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,123};
        int index = Arrays.binarySearch(arr,3);
        System.out.println(index);

    }
}
