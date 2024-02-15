package list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class exercise2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book1("aaa",12.3,"a"));
        list.add(new Book1("bbb",34.3,"b"));
        list.add(new Book1("ccc",1.3,"c"));
        list.add(new Book1("ddd",123.3,"d"));

        for (Object obj : list){
            System.out.println(obj);
        }

        sort(list);
        for (Object obj : list){
            System.out.println(obj);
        }

    }

    public static void sort(List list){
        int listsize = list.size();
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                //取出对象Book1
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j+1);
                if (book2.getPrice() < book1.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}

class Book1{
    private String name;
    private double price;
    private String author;

    public Book1(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称: " + getName() + " 价格: " + getPrice() + " 作者: " + getAuthor();
    }
}
