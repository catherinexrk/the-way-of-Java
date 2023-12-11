package StringBuffer;

/**
 * @author 陶笛
 */
public class buffer_to_string {
    public static void main(String[] args) {
        String str = "hello tom";
        //使用构造器
        //返回的才是stringbuffer对象,对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);

        //方式2
        //append追加字符串
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);



        //stringbuffer to string
        StringBuffer stringBuffer2 = new StringBuffer("xrk ");

        //使用自带tostring方法
        String str2 = stringBuffer2.toString();

        //使用构造器
        String str3 = new String(stringBuffer2);

    }
}
