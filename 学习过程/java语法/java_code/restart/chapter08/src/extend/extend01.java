package extend;

/**
 * @author 陶笛
 */
public class extend01 {
    public static void main(String[] args) {
        pupil pupil = new pupil();
        pupil.setScore(98);
        pupil.name = "aaa";
        pupil.age = 11;

        pupil.test();
        pupil.showInfo();

        graduate graduate = new graduate();
        graduate.setScore(97);
        graduate.name = "bbb";
        graduate.age = 21;

        graduate.test();
        graduate.showInfo();
    }
}
