package poly_.PolyArr;

/**
 * @author 陶笛
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    //重写方法
    @Override
    public String say() {
        return super.say() + " score = " + score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void study(){
        System.out.println("学生：" + getName() + "正在学java");
    }
}
