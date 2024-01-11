package poly_.polyparameter;

/**
 * @author 陶笛
 */
public class test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",9000);
        Manager mike = new Manager("jack",12000,200000);
        test test = new test();
        test.showEmpAnnual(tom);

        test.showEmpAnnual(mike);

        test.testWork(tom);
        test.testWork(mike);
    }

    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work(); //向下转型，调用子类特定方法
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
