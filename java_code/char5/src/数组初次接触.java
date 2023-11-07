public class 数组初次接触 {
    public static void main(String[] args) {
//        double chicken[6]={3,4,5,1.3,4.5,2};
//        double sum;
//        for (int i = 0;i < 6;i++){
//            sum += chicken[i];
//        }

        double[ ] hens = {3,5,6,3.2,4.5,9};
        double sum = 0;
        for (int i = 0;i < 6;i++){
            sum += hens[i];
        }
        System.out.println("总重量为: " + sum);
        System.out.println("数组的长度: " + hens.length);


    }
}
