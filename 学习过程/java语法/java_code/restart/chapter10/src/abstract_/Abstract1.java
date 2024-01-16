package abstract_;

/**
 * @author 陶笛
 */
public class Abstract1 {

}

abstract class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }

    //抽象方法，父类不实现，子类去进行实现
    public abstract void eat();//抽象方法没有方法体


}

//test2