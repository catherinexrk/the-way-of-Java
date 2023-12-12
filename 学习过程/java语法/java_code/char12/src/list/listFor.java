package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 陶笛
 */
public class listFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0;i < 10;i++){
            list.add("hello" + i);
        }

        //迭代器循环
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next = " + next);

        }

        System.out.println("====增强for循环");
        //增强for循环
        for (Object o : list) {
            System.out.println("list = " + o);
        }


        //普通
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
