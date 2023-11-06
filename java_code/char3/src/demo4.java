public class demo4 {
    public static void main(String[] args) {
        //逻辑运算符
        int n1 = 1;
        int n2 = 1;
        int n3 = 2;

        if(n1 == 1 & n1 < 0)
            System.out.println("1 OK");

        if(n1 == 1 && n1 < 0)
            System.out.println("2 ok");

        // &&前面对，则后面不判断   || 同理
        // &前面对，后面也判断
        // &&效率高 | 效率高


    }
}
