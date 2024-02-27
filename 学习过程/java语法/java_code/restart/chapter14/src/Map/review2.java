package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class review2 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new review_class("a",12000,1));
        hashMap.put(2,new review_class("b",9000,2));
        hashMap.put(3,new review_class("c",20000,3));

        //keySet
        Set keySet = hashMap.keySet();
        for (Object o : keySet) {
            review_class temp = (review_class) o;//向下转型

            if (temp.getSalary() > 10000){
                System.out.println(temp);
            }
        }

        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            review_class temp = (review_class) next;
            if (temp.getSalary() > 10000){
                System.out.println(temp);
            }

        }

    }
}

class review_class{
    private String name;
    private double salary;
    private int id;

    public review_class(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "review_class{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
