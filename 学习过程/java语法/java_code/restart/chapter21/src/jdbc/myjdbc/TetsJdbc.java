package jdbc.myjdbc;

public class TetsJdbc {
    public static void main(String[] args) {
        JdbcInterface temp = new MysqlJdbcImplent();
        temp.getConnect(); //使用接口调用实现类
        temp.crud();
        temp.close();

        temp.close();

        temp.crud();
    }
}
