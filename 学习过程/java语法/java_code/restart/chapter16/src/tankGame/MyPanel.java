package tankGame;

import javax.swing.*;
import java.awt.*;

//tank大战的绘图区域
public class MyPanel extends JPanel {
    Hero hero = null;

    public MyPanel(){
        hero = new Hero(100,100);//初始化坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充举行

        //画出坦克
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    //编写方法，画出坦克

    /**
     *
     * @param x 横坐标
     * @param y 纵坐标
     * @param g 画笔
     * @param direct 方向
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        //根据不同类型的tank设置不同颜色
        switch (type){
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据tank不同方向来绘制坦克
        switch (direct){
            case 0:
                g.fill3DRect(hero.getX(),hero.getY(),10,60,false);
                g.fill3DRect(hero.getX()+30,hero.getY(),10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);//圆形盖子
                g.drawLine(x+20,y+30,x+20,y);
                break;
            default:
                System.out.println("暂时未处理");
        }

    }
}
