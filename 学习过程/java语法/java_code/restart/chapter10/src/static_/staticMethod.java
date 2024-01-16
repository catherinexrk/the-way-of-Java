package static_;

/**
 * @author 陶笛
 */
public class staticMethod {
    public static void main(String[] args) {
        Math.abs(12);


    }
}

class stu {
    private String name;
    private static double sumFee = 0;//学生学费累计

    public stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee){
        sumFee += fee;
    }

    public static void showFee(){
        System.out.println("总学费有: " + sumFee);
    }
}
