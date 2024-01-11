package poly_.detail;

/**
 * @author 陶笛
 */
public class Cat extends Animal {
    public int n1 = 20;

    public Cat(String name) {
        super(name);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

    public void func1(){
        System.out.println("cat func1");
    }
}
