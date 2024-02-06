package StringBuffer;

public class exercise1 {
    public static void main(String[] args) {
        //接受一个字符串对象，接收用户输入的字符串价格
        //对字符串进行处理，转换成StringBuffer

        String price = "123423432432432352556.78";
        StringBuffer sb = new StringBuffer(price);//转换成StringBuffer
        //完成最简单的实现
        //找到小数点前三位，在前三位进行插入即可
//        int ladtIndex = sb.lastIndexOf(".");//找到小数点位置

        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");//插入后的新数组
        }
        System.out.println(sb);

    }
}
