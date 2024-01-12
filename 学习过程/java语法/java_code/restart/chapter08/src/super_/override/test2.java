package super_.override;

/**
 * @author 陶笛
 */
public class test2 {
    public static void main(String[] args) {

    }
}

class A {
    public Object show(){
        return null;
    }
}

class B extends A{
    @Override
    public String show() {
        return null;
    }

}
