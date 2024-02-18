package Map;

import java.util.HashMap;
import java.util.Map;

public class map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(1,"替换");
        map.put(3,"a");
        map.put(4,"a");
        map.put(5,"a");
        map.put("aaaaasd","dasds");

        System.out.println("map = " + map);
    }
}
