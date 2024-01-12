package list.Linkerlist;

/**
 * @author 陶笛
 */
public class linkedlist1 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mike = new Node("mike");
        //连接三个节点

        jack.next = tom;
        tom.next = mike;
        tom.pre = jack;
        mike.pre = tom;

        Node first = jack;
        Node end = mike;

        while (true) {
            if (first == null){
                break;
            }

            System.out.println(first);
            first = first.next;

        }
    }
}

class Node{
    public Object item;//存放数据
    public Node next;//下一个结点
    public Node pre;//前一个结点
    public Node(Object name){
        this.item = name;
    }

    public String toString() {
        return "Node name is " + item;
    }
}
