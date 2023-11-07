public class func {
    public static void main(String[] args) {
        Mytool array = new Mytool();
        int[][] map = {{1,2,3},{22,3,1},{4,3,88}};
        array.print2dimensionArray(map);//map是形参输入

        
    }
}

class Mytool{
    //接受一个二维数组
    public void print2dimensionArray(int[][] array){
        for(int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
