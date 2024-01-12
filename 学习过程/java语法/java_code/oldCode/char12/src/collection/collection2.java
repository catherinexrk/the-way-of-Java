package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 陶笛
 */
public class collection2 {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("aaa","a",12));
        col.add(new Book("bbb","b",123));
        col.add(new Book("ccc","c",1232));

        Iterator iterator = col.iterator();

        while(iterator.hasNext()) { //判断col是否为空
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        //迭代器提出while循环之后，这时iterator指向最后一个元素

        iterator = col.iterator();//重置迭代器


    }
}

class Book  {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
