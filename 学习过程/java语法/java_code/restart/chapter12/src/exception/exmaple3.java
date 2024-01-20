package exception;

import java.awt.*;

public class exmaple3 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("出现了一个算数异常");
        } catch (java.lang.Exception e) {
            System.out.println("总异常");
        } finally {
            System.out.println("finally 异常");
        }
        System.out.println("aaa");
    }
}

class AAA {
    private String name;

}


