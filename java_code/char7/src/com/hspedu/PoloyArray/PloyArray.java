package com.hspedu.PoloyArray;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Person("jack",20);
        persons[1] = new Student("rose",20,100);
        persons[2] = new Student("smith",21,98);
        persons[3] = new Teacher("scott",34,12000);
        persons[4] = new Teacher("mike",37,13000);

        for (int i = 0; i < persons.length; i++) {
            //编译类型person 运行类型根据每个对象而改变
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student){
                ((Student) persons[i]).study();
            }
            if (persons[i] instanceof Teacher){
                ((Teacher) persons[i]).teach();
            }

            ((Teacher)(persons[4])).teach();
        }

    }
}
