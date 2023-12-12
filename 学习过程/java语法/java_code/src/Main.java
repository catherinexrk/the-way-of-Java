import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    private PlayerPlane playerPlane;
    private List<EnemyPlane> enemyPlanes;

    public Main() {
        setTitle("飞机大战");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        playerPlane = new PlayerPlane(WIDTH / 2, HEIGHT - 50);
        enemyPlanes = new ArrayList<>();

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                playerPlane.handleKeyPress(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                playerPlane.handleKeyRelease(e.getKeyCode());
            }
        });

        setFocusable(true);

        Timer timer = new Timer(20, e -> {
            update();
            repaint();
        });
        timer.start();
    }

    private void update() {
        playerPlane.move();

        // 移动敌机
        for (EnemyPlane enemyPlane : enemyPlanes) {
            enemyPlane.move();
        }

        // 随机生成敌机
        if (Math.random() < 0.02) {
            enemyPlanes.add(new EnemyPlane(new Random().nextInt(WIDTH), 0));
        }

        // 检查碰撞
        checkCollisions();
    }

    private void checkCollisions() {
        Rectangle playerBounds = playerPlane.getBounds();

        // 检查与敌机的碰撞
        for (EnemyPlane enemyPlane : new ArrayList<>(enemyPlanes)) {
            Rectangle enemyBounds = enemyPlane.getBounds();
            if (playerBounds.intersects(enemyBounds)) {
                JOptionPane.showMessageDialog(this, "游戏结束！", "游戏结束", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        playerPlane.draw(g);

        // 绘制敌机
        for (EnemyPlane enemyPlane : enemyPlanes) {
            enemyPlane.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           Main planeGame = new Main();
            planeGame.setVisible(true);
        });
    }
}

class PlayerPlane {
    private int x, y;
    private int speed = 5;

    public PlayerPlane(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += speed;
        if (x < 0) x = 0;
        if (x > 750) x = 750;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 50, 30);
    }

    public void handleKeyPress(int keyCode) {
        if (keyCode == KeyEvent.VK_LEFT) {
            speed = -5;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            speed = 5;
        }
    }

    public void handleKeyRelease(int keyCode) {
        if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {
            speed = 0;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 30);
    }
}

class EnemyPlane {
    private int x, y;
    private int speed = 3;

    public EnemyPlane(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        y += speed;
        if (y > 600) {
            y = 0;
            x = new Random().nextInt(750);
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 50, 30);
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 30);
    }
}
