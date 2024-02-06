package StringBuffer;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        //value数组存放元素不是final类 char[] value属性
        //StringBuffer更新内容，不是更新地址，效率更高
        //StringBuffer是一个final类，不能被继承
        //char[] value类

        //2构造器指定char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }
}

