package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class arrays1 {
    public static void main(String[] args) {
        Integer[] integers = {1,2,34,-23,-999};
        System.out.println(Arrays.toString(integers));

        System.out.println(integers);

        //定制排序

        //调用sort方法，传入两个参数，一个是待排序数组，一个是匿名内部类
        //实现了Comparator的匿名内部类
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(integers));

        {
            Arrays.sort(integers, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return 01 - o2;
                }
            });

            System.out.println(Arrays.toString(integers));
        }
    }
}
