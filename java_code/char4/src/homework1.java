public class homework1 {
    public static void main(String[] args) {
        double sum = 100000;
        int flag = 0;
        while (true){
            if(sum > 50000){
                sum = sum * (1 - 0.05);
             } else {
                sum -= 1000;
            }

            flag++;
            if(sum < 1000)
                break;
        }
        System.out.println(flag);
    }
}
