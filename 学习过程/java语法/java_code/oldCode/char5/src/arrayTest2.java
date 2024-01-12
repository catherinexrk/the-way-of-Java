public class arrayTest2 {
    public static void main(String[] args) {
        double[] num = new double[10];
        for (int i = 0;i < num.length;i++){
            num[i] =(int)(Math.random()*100);
        }
        int max = 0;

        for(int i = 1;i < num.length;i++){
            if(num[max] < num[i]){
                max = i;
            }
        }
        for (int i = 0;i < num.length;i++){
            System.out.println(num[i]);
        }

        System.out.println("最大数值为" + num[max]);
    }
}
