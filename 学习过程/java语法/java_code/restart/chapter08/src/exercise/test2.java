package exercise;

/**
 * @author 陶笛
 */
public class test2 {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();
    }
}

class Computer{
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回详细信息
    public String getDetails(){
        return "cpu = " + cpu + " memory = " + memory + " disk = " + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

}

class PC extends Computer{
    private String brand;
    //  继承规则，自动将构造器初始化完成部署
    //体现出继承的基本思想，父类的构造器完成父类属性初始化
    //子类的构造器完成子类的初始化

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("pc信息如下");
        System.out.println(getDetails() + " brand = " + getBrand());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
