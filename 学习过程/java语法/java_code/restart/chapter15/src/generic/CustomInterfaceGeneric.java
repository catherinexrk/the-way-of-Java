package generic;

@SuppressWarnings("all")
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

//静态成员不能使用泛型
//泛型不具备继承性
//<?>支持任意泛型类型


interface IA extends IUSB<String,Double>{

}

class AA implements IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

interface IUSB<U,R>{


    int n = 10;
//    U name;
    R get(U u);

    void hi(R r);

    void run(R r1,R r2,U u1,U u2);

    default R method(U u){
        return null;
    }
}

