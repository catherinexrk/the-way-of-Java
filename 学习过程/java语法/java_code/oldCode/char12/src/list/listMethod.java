package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陶笛
 */
public class listMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");

        list.add(1,"aaa");
        System.out.println("list = " + list);
    }
}
