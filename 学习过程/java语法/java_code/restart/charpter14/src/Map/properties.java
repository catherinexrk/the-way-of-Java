package Map;

import java.util.Properties;

public class properties {
    public static void main(String[] args) {
        //继承hashtable
        //通过k-v存放数据 key value均不能为空
        //
        Properties properties = new Properties();

        properties.put("1","mike");
        properties.put("2","john");
        properties.put("3","school");
        properties.put("4","he");

        System.out.println(properties.get("1"));
    }
}
