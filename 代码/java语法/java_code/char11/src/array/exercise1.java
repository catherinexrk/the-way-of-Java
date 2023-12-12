package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/**
 * @author 陶笛
 */
public class exercise1 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book(12,"aaa");
        books[1] = new Book(20,"bbb");
        books[2] = new Book(30,"ccc");
        books[3] = new Book(50,"ddd");

        //按照价格从大到校
//        Arrays.sort(books, new Comparator() {
//            //这里是对book排序，o1和o2是book对象
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//
//                double priceValue = book2.getPrice() - book1.getPrice();
//                //进行转换
//                if (priceValue > 0) {
//                    return -1;
//                } else if (priceValue < 0) {
//                    return 1;
//                } else
//                    return 0;
//            }
//        });

        //按照书名长度进行排序
                Arrays.sort(books, new Comparator() {
            //这里是对book排序，o1和o2是book对象
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;

                return book1.getName().length() - book2.getName().length();
            }
        });



        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private double price;
    private String name;

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
