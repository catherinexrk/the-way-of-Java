package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陶笛
 */
public class exercise2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("aaa","a",13));
        list.add(new Book("bbb","b",343));
        list.add(new Book("ccc","c",123));

        //如何对集合进行一个排序

        for (Object o : list) {
            System.out.println(o);
        }

        sort(list);
        System.out.println("价格排序");
        for (Object o : list) {
            System.out.println(o);
        }


    }

    //静态方法实现集合按照价格排序
    public static void sort(List list){
        int listSize = list.size();

        for (int i = 0;i < listSize - 1;i++){
            for (int j = 0;j < listSize - 1 - i;j++){
                //取出对象book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice() > book2.getPrice()){
                    //前后交换位置按照从小往大进行排序
                    list.set(j,book2);
                    list.set(j + 1,book1);
                }


            }
        }
    }
}

