package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    //演示小球通过键盘控制上下左右移动
    //java事件控制

    MyPanel mp = null;
    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove(){
        mp = new MyPanel();//新建面板
        this.add(mp);//面板加入
        this.setSize(400,300);

        //jframe可以监听到键盘的事件，监听到面板上的键盘事件
        this.addKeyListener(mp);//

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener {
    //为了让小球移动设置坐标为变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);//默认黑色
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //监听键盘字符输入

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode() + "被按下..");

        //根据用户按下的不同键，来处理小球的移动 wasd
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }


        //让面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
