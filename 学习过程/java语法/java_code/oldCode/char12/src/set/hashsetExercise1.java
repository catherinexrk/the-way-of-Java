package set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 陶笛
 */
public class hashsetExercise1 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(new Car("aaa",10));
        linkedHashSet.add(new Car("bbb",1000));
        linkedHashSet.add(new Car("ccc",100));
        linkedHashSet.add(new Car("ddd",1000));
        linkedHashSet.add(new Car("aaa",10));

        System.out.println("HashSet = " + linkedHashSet);

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}' + '\n';
    }

    //重写equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
