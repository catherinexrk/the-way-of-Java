public class 可变参数练习 {
    public static void main(String[] args) {
        Method3 test = new Method3();
        test.showScore("徐仁坤",98,92,92);
    }
}

class Method3{
    public void showScore(String name,double... scores){
        double sum = 0;
        for (int i = 0;i < scores.length;i++){
            sum += scores[i];
        }
        System.out.println("姓名 " + name + " 总成绩 = " + sum);

    }
}
