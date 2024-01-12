package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 陶笛
 */
public class set1 {
    public static void main(String[] args) {
        //不可存放重复元素
        //无序存放
        Set set = new HashSet();
        set.add("aa");
        set.add("aaa");
        set.add("john");
        set.add(null);
        set.add(null);
        set.add("sdd");
//        System.out.println("set = " + set);

        //迭代器
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }

        System.out.println("增强for循环");
        //增强for循环
        for (Object o : set) {
            System.out.println(" o = " + o);
        }

        //set遍历的时候不能使用普通循环


    }
}
