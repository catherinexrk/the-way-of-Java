package bignum;

import java.math.BigDecimal;

/**
 * @author 陶笛
 */
public class bigdecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1232.123123131312313143141312312412414");
        System.out.println(bigDecimal);


        //加减乘除
        BigDecimal bigDecimal1 = new BigDecimal("100");
        BigDecimal add = bigDecimal.add(bigDecimal1);
        System.out.println(add);
    }
}
