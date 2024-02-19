package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hm2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);

        System.out.println(map);

        map.put("jack",2000);
        System.out.println("更新薪资完成");
        System.out.println(map);

        Set keyset = map.keySet();
        for (Object o : keyset) {
            map.put(o,(Integer)map.get(o) + 100);
        }

        System.out.println(map);

        //遍历员工
        System.out.println("遍历员工 使用entrySet");
        Set entrySet = map.entrySet();

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry) iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }



    }
}
