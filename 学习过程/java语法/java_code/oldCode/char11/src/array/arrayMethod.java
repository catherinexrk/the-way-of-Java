package array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 陶笛
 */
public class arrayMethod {
    public static void main(String[] args) {

        Integer arr[] = {1,54,2,-12,3,6,2,-1};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });

        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }
}
