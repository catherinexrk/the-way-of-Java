package 大数;

import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1222222222222312444444");
        System.out.println(bigInteger);

        //对bigintger进行加减乘除，使用对应的方法，不能直接进行算术运算
        BigInteger bigInteger1 = new BigInteger("123");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);

        BigInteger substract = bigInteger1.subtract(bigInteger);
        System.out.println(substract);
    }
}
