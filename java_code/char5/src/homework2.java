import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        Scanner in = new Scanner(System.in);
        System.out.println("输入待插入的元素");
        int insert = in.nextInt();//待插入的数值

        int index = -1;//待插入元素的下标


        for(int i = 0;i < arr.length;i++){
            if (arr[i] > insert){
                index = i;//找到位置
                break;
            }
        }
        if (index == -1)
            index = arr.length;
//        System.out.println("index = " + index);

        int[] arr2 = new int[arr.length+1];

        for(int i = 0,j = 0;i < arr2.length;i++){
            if(i != index) {
                arr2[i] = arr[j];
                j++;
            } else {
                arr2[i] = insert;
            }
        }



        for(int i = 0;i < arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }



    }
}
