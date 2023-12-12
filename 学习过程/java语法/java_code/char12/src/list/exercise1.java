package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 陶笛
 */
public class exercise1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0;i < 10;i++){
            list.add("hello" + i);
        }

        System.out.println("list = " + list);

        list.add(1,"test");
        System.out.println("list = " + list);

        System.out.println("第五个元素= " +list.get(4));

        list.remove(4);
        System.out.println("list = " + list);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next = " + next);

        }

    }
}
