package homework;

import com.sun.jdi.Value;

import java.sql.SQLOutput;

/**
 * @author 陶笛
 */
public class exercise4 {
    public static void main(String[] args) {
        Color color = Color.BLUE;
        color.show();

        switch (color) {
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case GRENN:
                System.out.println("green");
                break;
        }
    }
}

interface IMYinterface {
    public void show();
}
enum Color implements IMYinterface{
    RED(255,0,0),BLUE(0,0,255),GRENN(12,23,1);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为" + redValue + "," + blueValue + "," + greenValue);
    }
}
