package interface_;

public class Interface03 {
    public static void main(String[] args) {
        Mysql  mysql = new Mysql();
        Oracle oracle = new Oracle();
//
//        t(mysql);
//        t(oracle);
        test t = new test();
        t.func(mysql);
        t.func(oracle);

    }

    public static void t(DBinterface db){
        db.connect();
        db.close();
    }
}

class test{
    public void func(DBinterface db){
        db.connect();
        db.close();
    }
}
