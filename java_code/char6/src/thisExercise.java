public class thisExercise {
    public static void main(String[] args) {
        PersonTest marry= new PersonTest(18,"Marry");
        PersonTest mike = new PersonTest(18,"Mike");
        if(marry.comparePerson(mike))
            System.out.println("两人信息相等");
        else
            System.out.println("两人信息相等");

    }
}

class PersonTest {
    String name;
    int age;
    public PersonTest (int age,String name){
        this.age = age;
        this.name = name;
    }

    public boolean comparePerson(PersonTest p){
        return this.name == p.name && this.age == p.age;
    }
}
