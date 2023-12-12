package interface_;

public class Mysql implements DBinterface{
    @Override
    public void connect() {
        System.out.println("connect to the mysql");
    }

    @Override
    public void close() {
        System.out.println("disconnect to mysql");
    }
}
