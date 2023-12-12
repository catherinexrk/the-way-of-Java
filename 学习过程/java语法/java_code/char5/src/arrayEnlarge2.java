import java.util.Scanner;

public class arrayEnlarge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do{
            int[] arr1 = {1,2,3};

            //数组扩容---增加元素
            int[] arr2 = new int[4];
            for(int i = 0;i < arr1.length;i++){
                arr2[i] = arr1[i];//遍历传递原数组中的数值
            }
            int temp;
            temp=input.nextInt();
            arr2[arr2.length-1] = temp;//新增数值传递给新扩容好的数组后面
            arr1 = arr2;
            System.out.println("扩容后数组为:");
            for(int i = 0;i < arr1.length;i++) {
                System.out.println(arr1[i]);
            }
            System.out.println("是否还想继续添加？");

        }while(true);
    }
}
