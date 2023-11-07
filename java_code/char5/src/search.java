import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        String[] names = {"aaa", "bbb","ccc","ddd"};
        Scanner in = new Scanner(System.in);
        System.out.println("输入查找的姓名");

        String index_name = in.next();

        for(int i = 0;i < names.length;i++){
            if(index_name.equals(names[i])){
                System.out.println("find it! and the index is " + i);
                return;
            }
        }
        System.out.println("not find");
    }
}
