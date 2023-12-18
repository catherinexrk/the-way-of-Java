package generic;

import java.util.ArrayList;

/**
 * @author 陶笛
 */
public class test {
    public static void main(String[] args) {
        Tiger<String > objectTiger = new Tiger<>();
        objectTiger.func("hello world");


    }
}

class Tiger<E> {
    E e;
    public void func(E e){

    }
}