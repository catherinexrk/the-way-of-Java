public class 杨辉三角 {
    public static void main(String[] args) {
        int[][] arr = new int[5][];

        for (int i = 0;i < arr.length;i++){
            arr[i] = new int[i+1];//给每一个一维数组开辟空间

            for (int j = 0;i < arr[i].length;j++){
                if(j == 0 || j == arr[i].length-1)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];

            }
        }

        //遍历输出杨辉三角
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
