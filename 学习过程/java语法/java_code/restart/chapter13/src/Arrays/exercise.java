package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class exercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("aa133a",100);
        books[1] = new Book("bb11111b",300);
        books[2] = new Book("ccec",23);
        books[3] = new Book("dd33d",345);

//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book b1 = (Book) o1;
//                Book b2 = (Book) o2;
//                return (int) (b2.getPrice() - b1.getPrice());
//            }
//        });

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return (int) (b1.getName().length() - b2.getName().length());
            }
        });

        for (int i = 0; i < books.length;i++){
            System.out.println(books[i]);
        }
    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
