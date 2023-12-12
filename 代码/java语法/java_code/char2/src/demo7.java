public class demo7 {
    public static void main(String[] args) {
        int n1 = 1;
//        float n2 = n1 + 1.1;//错误，1.1默认转换为double类型
        float n3 = n1 + 1.1f;//正确

        byte b1 = 10;//给byte赋值时，如果数值在byte范围中，则可以存放
        int n2 = 10;
//        byte b2 = n2;//错误，n2为四个字节，超出byte范围

    }
}
