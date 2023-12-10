package CustomException;

/**
 * @author 陶笛
 */
public class customException {
    public static void main(String[] args) {
        int age = 10;

        if (age < 18 || age > 100) {
            throw new AgeException("年龄超过范围");
        }


    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}