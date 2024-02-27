package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashset {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("hello world"));
        set.add(34);
        set.add(34);
        set.add(new A("a"));
        set.add(123);

        System.out.println(set);

    }
}

class A{
    private String name;

    public A(String name) {
        this.name = name;
    }
}
