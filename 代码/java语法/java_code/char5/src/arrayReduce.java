import java.util.Scanner;

public class arrayReduce {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,6};

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("是否进行数组的删减元素? y/n");
            char choice = input.next().charAt(0);//输入选择
            if(choice == 'n')
                break;

            int[] arr2 = new int[arr1.length-1];
            for(int i = 0;i < arr2.length;i++){
                arr2[i] = arr1[i];
            }

            if(arr2.length == 1){
                System.out.println("数组长度为1，不可以再接着删除!");
                break;
            }

            for(int i = 0;i < arr2.length;i++){
                System.out.println(arr2[i]);
            }

            arr1 = arr2;
        }while(true);
    }
}
