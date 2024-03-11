package Array;


public class demo1 {
    /*
    给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
    写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     */

    public static void main(String[] args) {

    }
    public int binarySearch(int[] nums,int target){
        //二分查找

        int left = 0;
        int right = nums.length-1;
        //左闭右闭区间
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] < target){
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else{
                return mid;
            }
        }
        return -1;//查找失败
    }

    public int func2(int[] nums,int target){
        //左闭右开
        int left = 0;
//        int right = nums.length-1;
        int right = nums.length;//注意此时的right对应数组的长度 从而实现右开
        while (left < right){
            int mid =(left + right)/2;
            if (nums[mid] < target){
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                return mid;
            }
        }

        return -1;
    }
}


