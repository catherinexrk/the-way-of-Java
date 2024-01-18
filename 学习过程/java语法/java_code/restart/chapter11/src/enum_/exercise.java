package enum_;

import java.lang.management.MonitorInfo;

public class exercise {
    public static void main(String[] args) {
        Week[] week = Week.values();
        for (Week day:week){
            System.out.print(day);
            System.out.println(day.ordinal());
            day.say();

        }
    }
}


interface IA {
    public void say();
}
enum Week implements IA{

    Monday("1"),Tuesday("2"),Thrusday("3");
    private String name;
    private Week(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void say() {
        System.out.println("播放音乐");
    }
}
