package innerClass;

/**
 * @author 陶笛
 */
public class innerClassExercise2 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("起床");
            }
        });

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课辣");
            }
        });
    }
}

interface Bell{
    void ring();
}

class Cellphone {
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
