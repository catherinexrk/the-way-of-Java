package poly_.objectPoly;

/**
 * @author 陶笛
 */
public class test {
    public static void main(String[] args) {

        //编译类型animal 运行类型dog
        Animal animal = new Dog();
        animal.cry();

        Animal animal1 = new Cat();
        animal1.cry();

    }
}
