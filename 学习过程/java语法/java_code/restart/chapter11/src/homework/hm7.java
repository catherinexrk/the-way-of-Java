package homework;

public class hm7 {
    public static void main(String[] args) {
        Color.Red.show();
    }
}

interface MyInterface{
    public void show();
}
enum Color implements MyInterface{
    Black(12,23,3),Red(10,99,343);

    private int redValue;
    private int blueValue;
    private int greenValue;

    private Color(int redValue, int blueValue, int greenValue) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue = greenValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为 " + redValue + "," + blueValue + "," + greenValue);
    }
}


