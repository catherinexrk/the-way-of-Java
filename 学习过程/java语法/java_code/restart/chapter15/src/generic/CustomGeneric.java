package generic;

public class CustomGeneric {
    public static void main(String[] args) {

    }
}

class Tiger<T,R,M>{
    T t;
    R r;
    M m;

    public Tiger(T t, R r, M m) {
        this.t = t;
        this.r = r;
        this.m= m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
