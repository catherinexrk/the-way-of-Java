package jdbc.myjdbc;

public interface JdbcInterface {
    //连接
    public Object getConnect();

    //crud
    public void crud();

    //关闭连接
    public void close();
}
