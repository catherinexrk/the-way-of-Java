package generic;

/**
 * @author 陶笛
 */
public class generic3 {
    public static void main(String[] args) {
        Person<String> hello = new Person<>();

    }
}

class Person<E> {
    E e;

    public void trail1(){
        System.out.println();

    }


}
