package xrk.enum_;

/**
 * @author 陶笛
 */
public class Exercise4 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week temp : weeks){
            System.out.println(temp.toString());
            System.out.println(temp.ordinal());
        }
    }
}

enum Week{
    Monday("周一"),
    Tuesday("周二"),
    Thursday("周三"),
    Wensday("周四");

    private String name;

    private Week(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
