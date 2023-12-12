package interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型可以指向实现了该接口的类的对象的实例
        IG ig = new Teacher();

        IH ih = new Teacher(); //teacher并未实现
    }
}

interface IH {

}

interface IG extends IH{ //多态传递

}

class Teacher implements IG{

}