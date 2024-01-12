package poly_;

/**
 * @author 陶笛
 */
public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("大黄狗");
        Bone bone = new Bone("大棒骨");

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("小咸鱼");

        tom.feed(dog,bone);
        tom.feed(dog,fish);
//        tom.feed(dog,cat);

    }
}


