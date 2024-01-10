package extend;

/**
 * @author 陶笛
 */
public class pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void test(){
        System.out.println("小学生 " + name + " 正在考数学");
    }

    public void showInfo(){
        System.out.println("小学生:" + name + "年龄 " + age + " 成绩" + score);
    }
}
