package exception.自定义异常;

public class customException {
    public static void main(String[] args) {

        int age = 800;
        //要求年龄在80以内
        if (!(age >= 18 && age <= 80)) {
            throw new AgeException("年龄需要在18-80之间");
        }
    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
