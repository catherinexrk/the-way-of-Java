package poly_.detail;

/**
 * @author 陶笛
 */
public class Animal {
    private String name;
    public int n1 = 10;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void func1(){
        System.out.println("animal func1");
    }

    public void func2(){
        System.out.println("animal func2");
    }
}
