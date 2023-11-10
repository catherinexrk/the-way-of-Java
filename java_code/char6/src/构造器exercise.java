public class 构造器exercise {
    public static void main(String[] args) {
        Construcor test = new Construcor();
        System.out.println(test.age);
    }
}

class Construcor {
    int age;
    String name;
    public Construcor(){
        age = 18;
    }

    public Construcor(int pAge,String pName){
        age = pAge;
        name = pName;
    }
}
