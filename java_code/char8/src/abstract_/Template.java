package abstract_;

abstract public class Template { //抽象模板类

    public abstract  void job();//抽象方法

    public void calculate(){ //实现方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();//方法进行动态绑定
        long current = System.currentTimeMillis();
        System.out.println("执行时间 = " + (current-start));
    }
}
