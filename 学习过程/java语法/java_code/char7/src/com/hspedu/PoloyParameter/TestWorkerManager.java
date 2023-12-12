package com.hspedu.PoloyParameter;

public class TestWorkerManager {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2000);
        Manager mike = new Manager("mike",12000, 20000);
        TestWorkerManager test = new TestWorkerManager();
        test.showEmployeeAnnual(tom);
        test.showEmployeeAnnual(mike);

        test.testWorker(tom);
        test.testWorker(mike);
    }

    //传父类！
    public void showEmployeeAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWorker(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();//向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manage();//向下转型
        }
    }
}
