package com.hspedu.PoloyParameter2;

import com.hspedu.PoloyParameter.Manager;

public class Func {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 12000);
        Manage mike = new Manage("mike", 10000, 120000);

        Func test = new Func();
        test.testWork(jack);
        test.testWork(mike);

        test.testWorkerAnnual(jack);
        test.testWorkerAnnual(mike);
    }

    public void testWorkerAnnual(Employee e){
        System.out.println(e.getAnuual());
    }

    public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manage) {
            ((Manage) e).manage();
        }
    }
}
