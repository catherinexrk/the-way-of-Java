package poly_.PolyArr;

/**
 * @author 陶笛
 */
public class test {
    public static void main(String[] args) {
        //创建对象数组
        Person[] person = new Person[5];

        person[0] = new Person("jack",20);
        person[1] = new Student("tom",12,98);
        person[2] = new Student("mike",12,81);
        person[3] = new Teacher("yao",32,9000);
        person[4] = new Teacher("白起",43,12000);

        for (int i = 0;i < person.length ; i++){
            System.out.println(person[i].say());;//动态绑定机制
            //编译类型是person 运行类型是实际情况来判断是何种类型

            if (person[i] instanceof Teacher){
                ((Teacher)person[i]).teach(); //向下转型

            } else if (person[i] instanceof Student){
                ((Student)person[i]).study();
            }



        }


    }
}
