package generic.exercise;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author 陶笛
 */
public class exercise1 {
    public static void main(String[] args) {

    }

    @Test
    public void test(){

        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,24,"asd"));
        dao.save("003",new User(3,12,"jk"));

        List<User>  list = dao.list();

        System.out.println("list = " + list);
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class DAO<T> {
    private Map<String,T> map = new HashMap<>();

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    //遍历map，将map的所有value封装到arraylist中返回即可
    public List<T> list() {
        //创建list
        ArrayList<T> list = new ArrayList<>();

        //遍历map，返回list
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            list.add(map.get(key));
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

