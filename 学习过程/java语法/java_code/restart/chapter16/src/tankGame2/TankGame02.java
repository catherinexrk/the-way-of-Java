package tankGame2;

import javax.swing.*;
import java.awt.event.KeyListener;

public class TankGame02 extends JFrame {

    //定义一个panel
    MyPanel mp = null;
    public static void main(String[] args) {

        TankGame02 tankGame01 = new TankGame02();
    }

    public TankGame02(){
        mp = new MyPanel();
        this.add(mp);//把游戏绘图区域加入
        this.setSize(1000,750);
        this.addKeyListener(mp);//增减监听 让jframe监听键盘
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
