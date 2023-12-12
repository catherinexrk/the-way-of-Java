package System;

import java.util.Arrays;

/**
 * @author 陶笛
 */
public class system2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] test = new int[3];

        System.arraycopy(arr,0,test,0,3);

        System.out.println("test = " + Arrays.toString(test));
    }
}
