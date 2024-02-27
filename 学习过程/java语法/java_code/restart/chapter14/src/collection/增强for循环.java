package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 增强for循环 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("aaa","a",12));
        col.add(new Book("bbb","b",13));
        col.add(new Book("ccc","c",14));
        for (Object book : col){
            System.out.println("book = " + book);
        }

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
