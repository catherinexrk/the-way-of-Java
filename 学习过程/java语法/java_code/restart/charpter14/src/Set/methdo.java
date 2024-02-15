package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class methdo {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add(23);
        hashSet.add(null);
        hashSet.add(23);
        hashSet.add("asdsadsd");
        System.out.println(hashSet);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
