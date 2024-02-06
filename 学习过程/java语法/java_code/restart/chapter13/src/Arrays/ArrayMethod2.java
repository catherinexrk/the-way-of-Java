package Arrays;

import java.util.Arrays;

public class ArrayMethod2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        int[] temp = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(temp));

        boolean flag = Arrays.equals(arr,temp);
        System.out.println(flag);
    }
}
