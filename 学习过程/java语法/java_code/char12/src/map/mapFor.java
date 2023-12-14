package map;

import java.util.*;

/**
 * @author 陶笛
 */
public class mapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1",12);
        map.put("2","sdasd");
        map.put("3",12.3);
        map.put("3","hello");
        map.put(null,"sdasd");
        map.put("user1","小王");

        //遍历，先取出所有的key
        Set keyset = map.keySet();

        //增强for
        for (Object o : keyset) {
            System.out.println(o + "-" + map.get(o));
        }

        System.out.println("=====迭代器=====");

        //迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("======单独取出value=====");
        //第二种，把所有的values取出
        Collection values = map.values();
        //使用所有collection使用的遍历
        //增强for循环
        for (Object value : values) {
            System.out.println(value);
        }

        //迭代器
        System.out.println("=====迭代器=====");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            System.out.println(obj);
        }


        System.out.println("使用EntrySet获取k-v");
        //第三种，使用entrySet获取k-v
        Set entrySet = map.entrySet();
        //增强for循环
        for (Object entry : entrySet){
            //将entry转换成Map.entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue()) ;
        }

        //迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(next.getClass());
        }


    }
}


