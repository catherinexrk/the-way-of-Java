public class sort {
    public static void main(String[] args) {
    //bubble sort
        int[] arr = {1,3,2,7,5,1,2,23,11,6};
        for(int i = 0;i < arr.length-1;i++){    //length-1 次循环比较
            for(int j = 0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
