public class 构造器exercise {
    public static void main(String[] args) {
        Construcor test = new Construcor();
        System.out.println(test.age + "  " + test.name);
    }
}

class Construcor {
    int age;
    String name;
    public Construcor(){
        this(12,"小麦");
        age = 18;
        System.out.println("默认构造器");
    }

    public Construcor(int pAge,String pName){
        age = pAge;
        name = pName;
        System.out.println("有参构造器");
    }
}
