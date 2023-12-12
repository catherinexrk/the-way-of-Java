package abstract_;


public class Abstract01 {
    public static void main(String[] args) {

    }
}


class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }


    //所谓抽象方法，就是没有实现的方法
    public  void eat(){} //        System.out.println("这是个动物，不知道吃什么好");
}

