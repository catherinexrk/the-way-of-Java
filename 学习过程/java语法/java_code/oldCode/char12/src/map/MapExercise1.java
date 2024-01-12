package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 陶笛
 */
public class MapExercise1 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Emp("jack",30000,1));
        hashMap.put(2,new Emp("milan",3000,2));
        hashMap.put(3,new Emp("tom",10000,3));

        //遍历两种方式
        //1 使用KeySet 增强for循环
        Set keyset = hashMap.keySet();
        for (Object key : keyset) {
            Emp emp = (Emp) hashMap.get(key);
            if (emp.getSalary() > 18000){
                System.out.println(emp);
            }
        }

        //EntrySet迭代器遍历

        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            //通过next取得k -v
            Emp emp = (Emp) next.getValue();
            if (emp.getSalary() > 18000){
                System.out.println(emp);
            }

        }
    }
}

class Emp{
    private String name;
    private double salary;
    private int id;

    public Emp(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
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

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
