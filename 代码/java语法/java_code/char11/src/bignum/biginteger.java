package bignum;

import java.math.BigInteger;

/**
 * @author 陶笛
 */
public class biginteger {
    public static void main(String[] args) {
        long l = 23213313;
        System.out.println(" l = " + l);

        //使用biginteger
        BigInteger bigInteger = new BigInteger("123123123313123312312");
        System.out.println(bigInteger);

        BigInteger bigInteger1 = new BigInteger("100");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
    }
}
