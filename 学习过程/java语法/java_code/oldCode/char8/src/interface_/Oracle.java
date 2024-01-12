package interface_;

public class Oracle implements DBinterface{
    @Override
    public void connect() {
        System.out.println("Oracle coonect ");
    }

    @Override
    public void close() {
        System.out.println("discoonect ");
    }
}
