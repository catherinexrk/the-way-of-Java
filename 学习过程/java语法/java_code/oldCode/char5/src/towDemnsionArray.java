public class towDemnsionArray {
    public static void main(String[] args) {
        int[][] arr = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        //多少行
        for(int i = 0;i < arr.length;i++){
            //一行多少数
            for (int j = 0;j < arr[i].length;j++){
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
