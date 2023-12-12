public class 累减 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1;i <= 100;i++){
            sum += Math.pow(-1,i+1) * i * 1.0  / 1;
        }
        System.out.println(sum);
    }
}
