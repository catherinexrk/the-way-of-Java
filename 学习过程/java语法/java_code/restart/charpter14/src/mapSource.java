import java.util.*;

public class mapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","a");
        map.put("no2","b");
        map.put("3","aaa");
        map.put("3","asd");
        map.put(null,123);

        map.put("4","2133");


//        System.out.println("map = " + map);
        //取出所有的key
        Set keysey = map.keySet();
        for (Object key : keysey){
            System.out.println(key + "-" + map.get(key));
        }

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + "-" + map.get(next));
        }

        //把所有的value取出来
        Collection values = map.values();
        for (Object obj : values){
            System.out.print(values + " ");
        }

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        //通过entryset来获取
        Set entrySet = map.entrySet();
        //增强for循环
        for (Object entry : entrySet){
            //将enrty转换成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            //获取getKey getValue方法
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        //迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
//            System.out.println(next.getClass());
            Map.Entry n = (Map.Entry) next;
            System.out.println(n.getKey() + "-" + n.getValue());


        }

    }
}
