package Set;

import java.nio.file.NotLinkException;

public class Structer {
    public static void main(String[] args) {

        Node[] table = new Node[16];
        System.out.println("table = " + table);

        //创建节点
        Node john = new Node("john");
        table[2] = john;

        Node jack = new Node("jack");
        john.next = jack;
        System.out.println("table = " + table);

    }
}

class Node{
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }
}
