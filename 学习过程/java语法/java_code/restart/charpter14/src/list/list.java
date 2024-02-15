package list;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("hello world");
        list.add("hsp");
        System.out.println(list);

        System.out.println(list.get(2));
    }
}
