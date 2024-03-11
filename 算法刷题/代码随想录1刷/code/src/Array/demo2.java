package Array;

public class demo2 {
    public static void main(String[] args) {

    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        //二分查找
        //左闭右开
//        int left = 0;
//        int right = nums.length-1;
//        while (left <= right){
//            int mid = (left + right)/2;
//            if (nums[mid] > target){
//                right = mid -1;
//            } else if (nums[mid] < target){
//                left = mid +1;
//            } else {
//                return mid;
//            }
//        }

        //左闭右开
        int left = 0;
        int right = nums.length;
        while (left < right){
            int mid = (left + right -1)/2;
            if (nums[mid] > target){
                right = mid;
            } else if (nums[mid] < target) {
                left = mid +1;
            }
        }

        //目标值不在数组中，返回按顺序插入的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target){
                return i;
            }
        }

        return nums.length;

    }


}
