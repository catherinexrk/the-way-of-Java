package houserent.domain;

/**
 * 存储house对象的基本信息
 */
public class House {
    private int id;
    private String name;
    private String phont;
    private String address;
    private int rent;
    private String state;

    //构造器和构造方法

    public House(int id, String name, String phont, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phont = phont;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhont() {
        return phont;
    }

    public void setPhont(String phont) {
        this.phont = phont;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //为了方便输出对象信息，默认输出tostring

    @Override
    public String toString() {
        return  id  +
                "\t" + name +
                "\t" + phont +
                "\t" + address +
                "\t" + rent +
                "\t" + state;
    }
}
