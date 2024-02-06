package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-2,-34};
        System.out.println(Arrays.toString(arr));

        bubble2(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1; // return  i2 - i1
            }
        });


//        bubble01(arr);
//        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));



    }

    //冒泡
    public static void bubble01(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //定制
    public static void bubble2(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                //数组排序由c.compare()决定
                if (c.compare(arr[j],arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
