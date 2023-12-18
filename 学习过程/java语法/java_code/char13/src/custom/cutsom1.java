package custom;

/**
 * @author 陶笛
 */
public class cutsom1 {
    public static void main(String[] args) {

    }
}


//自定义泛型类
//T R M泛型的标识符
//泛型表示符可以多个
//使用泛型的数组不能被初始化
class Tiger<T,R,M> {
    String name;
    R r;
    T t;
    M m;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
