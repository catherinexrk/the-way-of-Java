package homework;

import org.junit.jupiter.api.Test;

import java.util.*;

@SuppressWarnings("alls")
public class hm1 {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){

    }
}

class User{
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    //遍历map
    public List<T> list(){
        List<T> list = new ArrayList<>();

        //遍历map
        Set<String> keySet = map.keySet();
        for (Object o : keySet) {
            list.add(map.get(o));
        }
        
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }

    public void save(String id,T entity){
        map.put(id,entity);
    }
}
