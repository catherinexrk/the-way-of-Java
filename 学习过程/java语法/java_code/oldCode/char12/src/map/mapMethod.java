package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 陶笛
 */
public class mapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1",12);
        map.put("2","sdasd");
        map.put("3",12.3);
        map.put("3","hello");
        map.put(null,"sdasd");
        map.put("user1","小王");

        System.out.println("map = " + map);

        System.out.println(map.get(null));

    }
}
