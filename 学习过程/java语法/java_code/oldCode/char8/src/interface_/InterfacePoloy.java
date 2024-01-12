package interface_;

public class InterfacePoloy {
    public static void main(String[] args) {
        Usb_[] usbs = new Usb_[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();

            //类型判断 运行类型判断
            if(usbs[i] instanceof Phone_)
                ((Phone_) usbs[i]).call();
            if (usbs[i] instanceof Camera_)
                ((Camera_) usbs[i]).say();
        }
    }
}

interface Usb_{
    void work();
}

class Phone_ implements Usb_{
    public void call(){
        System.out.println("phone call");
    }

    @Override
    public void work() {
        System.out.println("phone work");

    }
};

class Camera_ implements Usb_{
    @Override
    public void work() {
        System.out.println("camera work");
    }

    public void say(){
        System.out.println("camera say");
    }
};
