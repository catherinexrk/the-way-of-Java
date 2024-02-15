package exception.homework;

public class homework3 {
    public static void main(String[] args) {
        String name = "Xu Ren Kun";
        prinName(name);

    }

    public static void prinName(String name){
        if (name == null){
            System.out.println("Man");
            return;
        }

        String[] names = name.split(" ");
        if (names.length != 3){
            System.out.println("输入的字符串格式不正确");
        }
        String format = String.format("%s,%s .%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);

    }

}
