package exception.自定义异常;

public class test1 {
    public static void main(String[] args) {
        int age = 90;
        if(!(age >= 18 && age <= 80)){
            throw new AgeException_("年龄不在范围");
        }
    }
}

class AgeException_ extends RuntimeException{
    public AgeException_(String message) {
        super(message);
    }
}
