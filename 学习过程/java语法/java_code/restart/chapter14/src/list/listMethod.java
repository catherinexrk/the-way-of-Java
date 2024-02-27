package list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class listMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        System.out.println(list);
        list.add(1,"c");
        System.out.println(list);

        System.out.println(list.lastIndexOf("a"));

        list.remove("a");
        System.out.println(list);


    }
}
