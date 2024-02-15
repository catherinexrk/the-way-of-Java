package collection;

import java.util.ArrayList;
import java.util.List;

public class collectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add(10);
        list.add(true);
        list.add("hello world");
        System.out.println("list = " + list);

        list.remove(0);//删除第一个元素
        list.remove(2);
        System.out.println("list = " + list);

        ArrayList list1 = new ArrayList();
        list1.add("hello world");
        list1.add(3);
        list1.add("test number");


    }
}
