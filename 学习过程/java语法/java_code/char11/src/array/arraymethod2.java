package array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 陶笛
 */
public class arraymethod2 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,564,2,-12,3,-4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] arr){
        int temp = 0;
        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //结合冒泡进行定制排序
    public static void bubble2(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - 1 - i ; j++) {
                if (c.compare(arr[j] , arr[j+1]) > 0 ){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
