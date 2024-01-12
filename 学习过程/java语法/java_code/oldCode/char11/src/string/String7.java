package string;

/**
 * @author 陶笛
 */
public class String7 {
    public static void main(String[] args) {
        char sex = 'a';
        int age = 12;
        double salary = 1234;
        String name = "temp_name";

        String str1 = "my name is " + name + " my sex is " + sex + " salary is " + salary + " my age is " + age;
        System.out.println(str1);

        String str2 = String.format("my name is %s my age is %d my salary is %lf my sex is %c",name,age,salary,sex );
        System.out.println(str2);
     }
}
