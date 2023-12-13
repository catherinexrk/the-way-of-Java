package set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 陶笛
 */
public class hashset {
    public static void main(String[] args) {
        Set set = new HashSet();

        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(1));
        System.out.println(set.add(new Test("aaa")));

        System.out.println(set.add(new Test("aaa")));

        System.out.println("!!!!!");
        System.out.println(set.add(new String("hello")));
        System.out.println(set.add(new String("hello")));

        System.out.println("=========");
        System.out.println("set = " + set);

    }
}

class Test{
    public String name;

    public Test(String name){
        this.name = name;
    }
}
