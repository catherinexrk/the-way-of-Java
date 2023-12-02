package com.xrk.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        Stu jack = new Stu("jack");

        tom.payFee(100);
        jack.payFee(200);

        Stu.showFee();
    }
}

class Stu {
    private String name;

    private static double fee = 0;//总学费

    public Stu(String name){
        this.name = name;
    }

    public static void payFee(double fee){
        Stu.fee += fee;
    }

    public static void showFee(){
        System.out.println("总学费为:" + Stu.fee);
    }
}