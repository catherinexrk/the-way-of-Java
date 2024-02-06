package StringBuffer;

public class StringBuffer12 {
    public static void main(String[] args) {
        String str = "hello";
        //使用构造器
        StringBuffer stringBuffer = new StringBuffer(str);
        //append
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        //StringBuffer->String
        StringBuffer stringBuffer2 = new StringBuffer("helloworld");
        String str2 = stringBuffer2.toString();

        System.out.println(stringBuffer2.length());
    }
}
