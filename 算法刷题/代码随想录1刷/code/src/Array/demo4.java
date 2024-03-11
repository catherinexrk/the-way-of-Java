package Array;

public class demo4 {
    public static void main(String[] args) {
        boolean flag = isPerfectSquare(14);
        System.out.println(flag);
    }
    public static boolean isPerfectSquare(int num) {
//        {
//            //数学规律
//            //4=1+3  9=1+3+5
//            int temp = 1;
//            while (num > 0){
//                num -= temp;
//                temp += 2;
//            }
//            return num==0;
//        }

        {
            //暴力
            int i = 1,result = 1;
            while (result <= num){
                if (result == num){
                    return true;
                }
                i++;
                result = i*i;
            }

            return false;
        }


    }
}
