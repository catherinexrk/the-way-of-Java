package com.hspedu.encap;


public class Account {
    public String name;
    private String pwd;
    private double banlance;//余额

    //构造器


    public Account(String name, String pwd, double banlance) {
        setName(name);
        setBanlance(banlance);
        setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        } else {
            System.out.println("姓名输入有问题，长度不在正确范围内");
            this.name = "default";
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6){
            this.pwd = pwd;
        } else {
            System.out.println("密码长度不是正确长度");
            this.pwd = "123456";//默认密码长度
        }
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }
}