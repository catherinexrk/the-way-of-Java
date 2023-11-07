public class homwork3 {
    public static void main(String[] args) {
        int[] num = new int[10];
        //随机生成1-100内的整数
        for(int i = 0;i < num.length;i++){
            num[i] = (int)(Math.random()*100);
        }

        for (int i = 0;i < num.length;i++){
            System.out.print(num[i] + " " + num[num.length-i-1]);
            System.out.println();
        }

        double sum = 0;
        int max = 0,min = 0;
        for(int i = 0;i < num.length;i++){
            sum += num[i];
            if(num[i] > num[max]){
                max = i;
            }
            if(num[i] < num[min]){
                min = i;
            }
        }
        System.out.println("max = "+ max + " min = " + min +" average = "+ 1.0* sum / num.length);
    }
}
