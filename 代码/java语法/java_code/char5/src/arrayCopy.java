public class arrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        //创建新的数组arr2，大小保证和arr1一样大即可
        int[] arr2 = new int[arr1.length];

        //遍历arr1，把每个元素拷贝到对应的位置
        for(int i = 0;i < arr1.length;i++){
            arr2[i] = arr1[i];//逐个拷贝复制arr1的元素信

        }


    }
}
