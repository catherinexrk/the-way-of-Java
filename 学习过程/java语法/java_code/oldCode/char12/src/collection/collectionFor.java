package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 陶笛
 */
public class collectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("aaa","a",12));
        col.add(new Book("bbb","b",123));
        col.add(new Book("ccc","c",1232));

        //使用增强for循环
        for (Object book : col){
            System.out.println("book = " + book);
        }


    }
}
