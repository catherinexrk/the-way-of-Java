package poly_;

/**
 * @author 陶笛
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //主人给小狗喂骨头
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主任 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
//    }

    public void feed(Animal animal,Food food){
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }
}
