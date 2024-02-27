package collections_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collection1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
