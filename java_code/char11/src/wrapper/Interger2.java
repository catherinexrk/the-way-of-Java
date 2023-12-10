package wrapper;

/**
 * @author 陶笛
 */
public class Interger2 {
    public static void main(String[] args) {
        //包装类自动装箱
        Integer i = 10;
        //方式一
        String str1 = i + "";
        //方法二
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        //String - > 包装类
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);

        Integer i3 = new Integer(str4);

    }
}
