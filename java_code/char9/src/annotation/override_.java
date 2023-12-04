package annotation;

/**
 * @author 陶笛
 */
public class override_ {
}

class A {
    public void play(){};
}

class B extends A {
    @Override
    public void play() {
        System.out.println("B类重写父类A的成员方法");
    }
}
