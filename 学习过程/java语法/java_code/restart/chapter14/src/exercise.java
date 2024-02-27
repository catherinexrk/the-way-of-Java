import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class exercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        //添加对象
        hashMap.put(1,new Worker("a",123,1));
        hashMap.put(2,new Worker("b",1000,2));
        hashMap.put(3,new Worker("c",913,3));

        //遍历  keySey
        Set keySet = hashMap.keySet();
//        for (Object key : keySet){
//            System.out.println(key + "-" + hashMap.get(key));
//        }
//
//        Iterator iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            System.out.println(next + "-" + hashMap.get(next));
//        }
        for (Object key : keySet) {
            Worker worker = (Worker) hashMap.get(key);
            if (worker.getSalary() > 500){
                System.out.println(worker);
            }
        }

        //EntrySet
        Set entrySet = hashMap.entrySet();
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            //通过entry取得key value
            Worker worker = (Worker) entry.getValue();
            if (worker.getSalary() > 500){
                System.out.println(worker);
            }
        }

    }
}

class Worker{
    private String name;
    private double salary;
    private int id;

    public Worker(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker{" +
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
