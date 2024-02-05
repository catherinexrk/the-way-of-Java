package String_;

public class string_ {
    public static void main(String[] args) {
        String str = "hello world";
        String s1 = "1111";
        String s2 = "1111";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = new String("1111");
        //当调用intern方法时，如果池中已经包含了一个等于此String对象的字符串，则返回池中华的字符串，否则将string对象添加到池中，并返回string对象
        System.out.println(s1 == s3.intern());
        System.out.println(s3 == s3.intern()); //s3.intern返回常量池的地址  s3指向的是堆中的地址

    }
}
