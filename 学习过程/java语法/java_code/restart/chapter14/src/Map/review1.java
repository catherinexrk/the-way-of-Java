package Map;

import java.util.*;

@SuppressWarnings({"all"})
public class review1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        for (int i = 0; i < 10; i++) {
            map.put(i,"no" + i);
        }

//        Set keyset = map.keySet();
//        System.out.println("根据key去查找value");
//
//        for (Object obj : keyset){
//            System.out.print(map.get(obj) + " ");
//        }
//
//        System.out.println();
//        //迭代器
//        System.out.println("根据迭代器");
//        Iterator iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            System.out.print(map.get(next) + " ");
//        }
//        System.out.println();
//
//        //取出所有的values
//        System.out.println("取出所有的values进行输出");
//        Collection value = map.values();
//        for (Object o : value) {
//            System.out.print(o + " ");
//        }
//        System.out.println();
//
//        Iterator iterator1 = value.iterator();
//        while (iterator1.hasNext()) {
//            Object next =  iterator1.next();
//            System.out.print(next + " ");
//        }
//        System.out.println();

        Set entrySet = map.entrySet();
        //for
        System.out.println("for循环");
        for (Object entry : entrySet) {
            //将entry转换成Map.entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        //迭代器
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() + "-" + m.getValue());

        }

    }
}
