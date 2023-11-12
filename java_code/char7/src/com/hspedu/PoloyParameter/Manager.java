package com.hspedu.PoloyParameter;

public class Manager extends Employee{
    private double extra;

    public Manager(String name, double salary, double extra) {
        super(name, salary);
        this.extra = extra;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public void manage(){
        System.out.println("经理 " + getName() + "正在管理员工");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + extra;
    }
}

