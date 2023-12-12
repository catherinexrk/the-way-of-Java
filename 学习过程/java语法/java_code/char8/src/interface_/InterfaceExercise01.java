package interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        C c = new C();
        c.px();
    }
}

interface A__{
    int x = 1;
}

class B{
    int x = 0;
}

class C extends B implements A__{
    public void px(){

        //访问父类的元素 super.x
        //访问接口 A.x

        System.out.println(" x = " + super.x);
        System.out.println(" x = " + A__.x);
    }
}
