package homework;

public class Person {
    private String name;
    private Vehicles vehicles;

    //在创建对象的时候先给他创建一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
//        if (vehicles == null)
        //判断当前vehicle是不是boat
        if(!(vehicles instanceof Boat)){
            Boat boat = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common(){

        if (vehicles == null){
            Horse horse = VehiclesFactory.getHorse();
        }

        vehicles.work();
    }
}
