package object;

/**
 * @author 陶笛
 */
public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        System.out.println(b == c);
        System.out.println(b.equals(c));

        Object object = new A();
    }
}

class A{
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            return false;
        }
    }
}
/*
f t f f t
 */
