package CustomException;

/**
 * @author 陶笛
 */
public class customException {
    public static void main(String[] args) {
        int age = 1000;
        //gae在18-80之间
        if (!(age >= 18 && age <= 120)) {
            throw new Age("年龄需要在18-120区间");
        }
        System.out.println("年龄范围正确");
    }
}

class Age extends RuntimeE xception {
    public  Age(String message){
        super(message);
    }
}
