package extend;

/**
 * @author 陶笛
 */
public class graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void test(){
        System.out.println("大学生 " + name + "正在学java" );
    }

    public void showInfo(){
        System.out.println("大学生:" + name + "年龄 " + age + " 成绩" + score);
    }
}
