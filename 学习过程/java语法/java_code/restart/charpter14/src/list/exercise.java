package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello " + i);
        }
        System.out.println(list);

        list.add(1,"2 index");
        System.out.println(list);

        System.out.println("第五个元素 = " + list.get(4));

        list.remove(6);

        list.set(6,"修改完成的第七个元素");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj = " + next );
        }

        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
