package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


public class Iterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("aaa","a",12));
        col.add(new Book("bbb","b",13));
        col.add(new Book("ccc","c",14));


//        System.out.println(col);
        //1.先得到col对应的迭代器
        java.util.Iterator iterator = col.iterator();
        while (iterator.hasNext()){ //判断是否还有数据
            Object obj = iterator.next(); //获取下一个元素
            System.out.println("obj = " + obj);
        }
        //此时iterator已经指向队尾
        //如果希望再次遍历，需要重置迭代器
        iterator = col.iterator();//重置迭代器
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj2 = " + next);
        }

    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
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
}
