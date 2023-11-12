package com.hspedu.debug;

import java.util.Arrays;

public class Debug2 {
    public static void main(String[] args) {
        int[] arr = {1,2,23,21,1,4325,23,21,3,4,5,6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + i);
        }
    }
}
