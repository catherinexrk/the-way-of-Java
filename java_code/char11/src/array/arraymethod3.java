package array;

import java.util.Arrays;

/**
 * @author 陶笛
 */
public class arraymethod3 {
    public static void main(String[] args) {
        Integer arr[] = {1,54,2,-12,3,6,2,-1};

        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr,1);
        System.out.println(index);
    }
}
