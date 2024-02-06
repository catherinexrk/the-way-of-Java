package StringBuffer;

public class StringBuffer3 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer);

//        StringBuffer stringBuffer1 = new StringBuffer(str); 出现空指针异常

    }
}
