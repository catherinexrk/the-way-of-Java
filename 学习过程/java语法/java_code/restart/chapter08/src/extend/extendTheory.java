package extend;

/**
 * @author 陶笛
 */
public class extendTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.son);
        System.out.println(son.father);
        System.out.println(son.grand);
    }
}

class Grand {
    public String grand = "爷爷";
}

class Father extends Grand{
    public String father = "爸爸";
}

class Son extends Father{
    public String son = "儿子";
}
