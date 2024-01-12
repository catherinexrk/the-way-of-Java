package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 陶笛
 */
public class map1 {
    public static void main(String[] args) {
        //map和collection并列存在ley-value
        //key不可以重复，value可以
        //value可以重复

        Map map = new HashMap();
        map.put("no1","aaa");//k-v
        map.put("no2","bbb");
        map.put("no3","ccc");
        map.put("no4","aaa");
        map.put(null,"test");

        map.put(null,"temp");
        System.out.println("map = " + map);
    }
}
