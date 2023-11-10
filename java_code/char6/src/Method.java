public class Method {
    public static void main(String[] args) {
        MyTools tools = new MyTools();
        Person2 p1 = new Person2();
        p1.age = 12;
        p1.name = "new";


        Person2 p2 = new Person2();
        p2 = tools.copyPerson(p1);
        System.out.println(p2.age);
        System.out.println(p2.name);
    }
}

class Person2 {
    String name;
    int age;
}

class MyTools{
    public Person2 copyPerson(Person2 oldP){
        Person2 newP = new Person2();
        newP.name = oldP.name;
        newP.age = oldP.age;
        return newP;
    }
}
