package generic;

import java.util.*;

public class genericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("mike",20));
        students.add(new Student("john",25));

        //遍历
        for (Object o : students) {
            System.out.println(o);
        }

        //hashmap
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("1",new Student("jack",12));
        hm.put("2",new Student("john",13));
        hm.put("3",new Student("mike",14));

        Set set = hm.keySet();
        for (Object o : set) {
            System.out.println(o + "-"  + hm.get(o));
        }

        //迭代器
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();

        Iterator<Map.Entry<String, Student>> iterator = entrySet.iterator();

        System.out.println("entrySet 迭代器");
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());

        }


    }
}

class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
