package generic;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

/**
 * @author 陶笛
 */
public class ecercise1 {
    public static void main(String[] args) {
        //使用泛型，给hashset存放
        HashSet<Student> studens = new HashSet<Student>();
        studens.add(new Student("a",18));
        studens.add(new Student("a",18));
        studens.add(new Student("b",19));
        studens.add(new Student("c",20));

        for (Student student :studens) {
            System.out.println(student);
        }

        //使用hashmap
        HashMap<String,Student> hm = new HashMap<String,Student>();
        hm.put("a",new Student("aaa",18));
        hm.put("b",new Student("bbb",19));
        hm.put("c",new Student("ccc",20));

        //迭代器遍历 EntrySet
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next);

            

        }

    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
