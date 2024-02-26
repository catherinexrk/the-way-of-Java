package generic;

import java.util.ArrayList;

public class detail {
    public static void main(String[] args) {
        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig2 = new Pig<A>(new B());

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Pig> arrayList1 = new ArrayList<>();


    }
}

class A{}

class B extends A{}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
}
