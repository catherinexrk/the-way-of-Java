package list.Linkerlist;

import java.util.LinkedList;

/**
 * @author 陶笛
 */
public class test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);

        linkedList.add(2);
        linkedList.add(3);

        System.out.println("list = " + linkedList);

        linkedList.remove();
        System.out.println("list = " + linkedList);

    }
}
