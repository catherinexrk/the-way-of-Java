package StringBuffer;

import java.util.Scanner;

/**
 * @author 陶笛
 */
public class exercise {
    public static void main(String[] args) {
        //思路分析，接受一个字符串
        Scanner input = new Scanner(System.in);

        //接受一个价格
        //string 转换成 stringbuffer
        //利用相关方法进行操作字符串
        String price = "2123456.5678";
        StringBuffer sb = new StringBuffer(price);

        //先找到小数点的索引
//        int i = sb.lastIndexOf(".");//查找小数点位置
//        sb.insert(i-3,",");//进行价格逗号标注

        for (int i  = sb.lastIndexOf("." ) - 3; i > 0 ; i -= 3){
            sb = sb.insert(i,",");
        }
        System.out.println(sb);

    }
}
