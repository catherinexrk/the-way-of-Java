package extend;

import extend.improve.Base;

/**
 * @author 陶笛
 */
public class Sub extends Base {
    public Sub(){
//        super();
        System.out.println("子类无参");
    }

    public Sub(double a){
        System.out.println("子类有参");
    }

    public Sub(double salary,String name){
        super();
        System.out.println("调用父类无参");

    }
}
