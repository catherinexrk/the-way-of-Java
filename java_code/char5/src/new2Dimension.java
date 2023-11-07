public class new2Dimension {
    public static void main(String[] args) {
        int[][] arr =new int[2][3];

        for(int i = 0;i < arr.length;i++){
            //一行多少数
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /*
        二维数组是存放多个一维数组的一维数组

         */

        int[][][] arr2 = new int[10][9][2];


    }
}
