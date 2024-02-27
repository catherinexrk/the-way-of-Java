package homework;

import java.util.Scanner;

public class hm1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();


    }
}

class A extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Math.random() * 100 + 1);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) { //构造器中传入A类对象
        this.a = a;
    }

    @Override
    public void run() {
        //接受到用户的一个输入

        while (true){
            System.out.println("输入你的指令(Q退出)");
            char key = scanner.next().toUpperCase().charAt(0);

            if (key == 'Q'){
                //已通知的方式去结束线程
                a.setLoop(false);
                break;
            }
        }

    }
}