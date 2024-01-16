package interface_;

/**
 * @author 陶笛
 */
public interface Interface2 {
    //写属性
    public int n1 = 10;
    //写方法
    //在接口中，方法不用写abstract关键词
    public void say();

    //可以有默认实现方法，但是有关键词default
    default public void jump(){
        System.out.println("jump 跳跃");
    }
}
