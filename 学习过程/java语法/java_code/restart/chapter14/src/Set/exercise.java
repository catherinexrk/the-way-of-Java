package Set;

import java.util.HashSet;
import java.util.Objects;

public class exercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Worker("milan",18));
        hashSet.add(new Worker("mike",28));
        hashSet.add(new Worker("milan",18));
        System.out.println(hashSet);
    }
}

class Worker{
    private String name;
    private int age;

    public Worker(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
