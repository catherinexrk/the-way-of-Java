package list;

public class Linkedlist1 {
    public static void main(String[] args) {
        Node jack = new Node("jck");
        Node tom = new Node("tom");
        Node xm = new Node("xm");

        //jack tom xm
        jack.next = tom;
        tom.next = xm;
        xm.pre = tom;
        tom.pre = jack;

        Node first = jack;//first指向首节点
        Node last = xm;//last指向尾节点

    }
}

class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item){
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
