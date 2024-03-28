package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

public class JdbcConnect {
    public static void main(String[] args) {

    }

    public void connect02(){
        //使用反射加载类 动态加载 更加的灵活 减少依耐性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        //user password固定好的，后面的数值根据情况进行更改
        properties.setProperty("user","root"); //用户名
        properties.setProperty("password","111111"); //密码

        Connection connection = driver.connect(url,properties);
        System.out.println(connection);



    }
}
