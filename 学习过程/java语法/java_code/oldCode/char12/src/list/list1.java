package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陶笛
 */
public class list1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("bbb");

        System.out.println("list = " + list);
        System.out.println(list.get(0));
    }
}
