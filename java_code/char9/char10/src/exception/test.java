package exception;

/**
 * @author 陶笛
 */
public class test {
    public static void main(String[] args) {
        Cat cat = new Cat("猫");
        cat = null;
        System.out.println(cat.name);
    }
}

class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }
}
