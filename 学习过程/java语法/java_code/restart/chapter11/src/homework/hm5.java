package homework;

public class hm5 {
    public static void main(String[] args) {

    }
}

interface Vechicles{

    public void work();
}

class Horse implements Vechicles{
    @Override
    public void work() {
        System.out.println("horse work");
    }
}

class Boat implements Vechicles{
    @Override
    public void work() {
        System.out.println("boat work");
    }
}

class vechicleFactory{
    public static Horse getHorse(){
        return new Horse();
    }

    public static Boat getBoat(){
        return new Boat();
    }
}

class Person{
    private String name;
    private Vechicles vechicles;

    public Person(String name,Vechicles vechicles){
        this.name = name;
        this.vechicles = vechicles;
    }

    //实例化perso的对象

    public void pssRiver(){
        Boat boat = vechicleFactory.getBoat();//获取船
        boat.work();
    }

    public void common(){
        Horse horse = vechicleFactory.getHorse();
        horse.work();
    }
}
