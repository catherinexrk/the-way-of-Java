public class MonkeyEatPeach {
    public static void main(String[] args) {

    }
}

class Monkey {
    public int func(int day) {
        if (day == 1) {
            return 1;
        } else if (day >= 1 && day < 10) {
            return 2 * (day + 1);
        } else{
            System.out.println("天数输入有问题");
            return 0;
        }
    }

}