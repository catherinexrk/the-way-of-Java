package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 陶笛
 */
public class collection1 {
    public static void main(String[] args) {
        //colletion 接口有两个重要的子接口list set单类集合
        //map 实现的子类，是双列集合，存放的k-v hashmap\treemap
        List list =  new ArrayList();
        list.add("jack");
        list.add(true);
        for (int i = 0; i < 10; i++){
            list.add(i + 'a');
        }

        System.out.println("list = " + list);

        System.out.println(list.size());

        list.remove("jack");
        System.out.println("list = " + list);

        List list1 = list;

        list.clear();
        System.out.println("list = " + list);

        list.addAll(list1);

        System.out.println("list = " + list);


    }
}
