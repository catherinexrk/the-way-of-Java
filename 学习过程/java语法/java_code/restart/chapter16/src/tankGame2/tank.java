package tankGame2;

//坦克类
public class tank {
    private int x;
    private int y;

    public void moveUp(){
        y -= 1;
    }

    public void moveight(){
        x += 1;
    }

    public void moveDown(){
        y -= 1;
    }

    public void moveLeft(){
        x -= 1;
    }
    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    private int direct;//tank方向 0，1，2，3 up right down left

    public tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
