package com.hspedu.extend_.exercise_;

public class Pc extends Computer{
    private String band;


    public Pc(String cpu, int memory, int disk, String band) {
        super(cpu, memory, disk);//父类构造器初始化
        this.band = band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void showInfo(){
        System.out.println("cpu信息如下");
        System.out.println(getDetail());
        System.out.println(band);
    }
}
