package jdbc.myjdbc;

public class MysqlJdbcImplent implements JdbcInterface {

    @Override
    public Object getConnect() {
        System.out.println("得到jdbc的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql的连接");
    }
}
