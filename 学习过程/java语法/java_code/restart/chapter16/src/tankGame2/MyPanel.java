package tankGame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//tank大战的绘图区域
public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;

    public MyPanel(){
        hero = new Hero(100,100);//初始化坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充举行

        //画出坦克
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
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
        //按照向上、向下、左右不同方向进行区分坦克
        //direct 0 up 1 right 2 down 3 left
        switch (direct){
            case 0: //默认向上
                g.fill3DRect(hero.getX(),hero.getY(),10,60,false);
                g.fill3DRect(hero.getX()+30,hero.getY(),10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);//圆形盖子
                g.drawLine(x+20,y+30,x+20,y);
                break;
            case 1: //right
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);//圆形盖子
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2: //down
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);//圆形盖子
                g.drawLine(x+30,y+20,x+20,y+60);
                break;
            case 3: //left
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);//圆形盖子
                g.drawLine(x+30,y+20,x,y+20);
                break;
            default:
                System.out.println("暂时未处理");
        }

        this.repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa键按下情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            //改变tank方向
            hero.setDirect(0);
        } else if (e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirect(1);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
