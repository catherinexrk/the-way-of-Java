package array;

import java.util.Arrays;

/**
 * @author 陶笛
 */
public class array1 {
    public static void main(String[] args) {

        Integer[] integers = {1,2,3};

        System.out.println(Arrays.toString(integers));

        //sort排序方法使用
        Integer[] integers1 = {1,5,3,90,-2,-3};
        Arrays.sort(integers1);
        System.out.println(Arrays.toString(integers1));




    }
}
