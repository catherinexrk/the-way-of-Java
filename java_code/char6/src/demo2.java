
public class demo2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 12;
        p1.speak();
        p1.cal1();
        String s1 = "hello";
        System.out.println(s1.equals("hello"));//字符串相等比较


        System.out.println("2-100 的累加结果为: " + p1.cal2(2,100));

    }
}

class Person{
    String name;
    int age;

    public void  speak(){
        System.out.println("我是一个好人!");
    }

    public void cal1(){
        int sum = 0;
        for(int i = 1 ;i <= 100 ;i++){
            sum += i ;
        }
        System.out.println("累加结果为: " + sum);
    }

    public int cal2(int start,int end){
        int sum = 0;
        for (;start <= end;start++){
            sum += start;
        }
        return sum;
    }
}