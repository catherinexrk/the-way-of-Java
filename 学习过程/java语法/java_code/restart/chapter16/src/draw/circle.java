package draw;

import javax.swing.*;
import java.awt.*;
import java.util.PrimitiveIterator;

@SuppressWarnings("all")
public class circle extends JFrame{
    //定义面板
    private Mypanel mp = null;

    public static void main(String[] args) {
        //画圆
        new circle();
        System.out.println("退出程序");

    }

    public circle(){
        //初始化面板
        mp = new Mypanel();
        //把面板放入到窗口
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击小× 程序自动释放 完全退出
        this.setVisible(true);
    }
}

class Mypanel extends JPanel{

    //Graphics g
    //Mypanel 对象是一个画板
    //g是一支画笔
    @Override
    public void paint(Graphics g) {
        super.paint(g);//调用父类方法进行初始化
//        g.drawOval(0,0,100,100);//画圆
//        g.drawRect(10,10,100,100);
//        {
//            g.setColor(Color.BLUE);
//            g.fillRect(10,10,100,100);
//        }
//        g.fillOval(10,10,100,100);

        g.setColor(Color.red);


    }
}
