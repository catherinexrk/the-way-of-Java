package homework;

/**
 * @author 陶笛
 */
public class exercise2 {
    public static void main(String[] args) {
        Person tangsen = new Person("唐僧", new Horse());
        tangsen.common();//一般情况
        tangsen.passRiver();//骑马

    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("一般情况下使用马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况下使用船");
    }
}

class VehiclesFactory {

        public static Horse getHorse() {
            return new Horse();
        }

        public static Boat getBoat() {
        return new Boat();
    }
}

