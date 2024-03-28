package jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1 注册驱动
        Driver driver = new Driver();

        //2 得到连接  3306是mysql的监听端口
        //hsp_db02 指的是
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        //user password固定好的，后面的数值根据情况进行更改
        properties.setProperty("user","root"); //用户名
        properties.setProperty("password","111111"); //密码

        Connection connect = driver.connect(url, properties);


        //3 执行sql
        String sql = "insert into actor values(null,'mike','男','2002-12-2','130')";
        //用于执行静态sql语句并且返回静态结果
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql); //受影响的行数
        if (rows >= 1){
            System.out.println("成功");
        }
        //rows = 1 success rows = 0 failed


        //4 关闭连接源
        statement.close();
        connect.close();

    }
}
