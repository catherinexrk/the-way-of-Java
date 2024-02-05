package wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类Integer -> String
        Integer i =100;
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);


        //String->包装类
        String str4 = "1234";
        int i1 = Integer.parseInt(str4);//强制转换
        int i2 = new Integer(str4);//构造器


    }
}
