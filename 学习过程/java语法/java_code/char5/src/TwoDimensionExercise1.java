public class TwoDimensionExercise1 {
    public static void main(String[] args) {

        int[][] arr = new int[3][];//开了一个二维空数组

        for (int i = 0;i<arr.length;i++){
            arr[i] = new int[i + 1];//给每个一维数组开空间

            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = i + 1;
            }
        }

        for (int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
