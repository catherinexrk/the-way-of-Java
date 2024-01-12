//package generic;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//
///**
// * @author 陶笛
// */
//public class exercise4 {
//    public static void main(String[] args) {
//
//        ArrayList<Employ> employees = new ArrayList<>();
//        employees.add(new Employ("tom", 120000, new MyDate(2000, 12, 3)));
//        employees.add(new Employ("jack", 1200, new MyDate(2001, 3, 5)));
//        employees.add(new Employ("mike", 3000, new MyDate(1989, 1, 5)));
//
//
//        System.out.println("排序");
//            employees.sort(new Comparator<Employ>() {
//                @Override
//                public int compare(Employ o1, Employ o2) {
//                    //先对o1和o2进行类型判断，不是employ则结束
//                    if (!(o1 instanceof Employ && o2 instanceof Employ)) {
//                        System.out.println("类型不匹配");
//                        return -1;
//                    }
//                    //比较名字
//                    int i = o1.getName().compareTo(o2.getName());
//                    if (i != 0) {
//                        return i;
//                    }
//
//                    return 0;
//            }
//        });
//
//
//        System.out.println("employess = " + employees);
//
//    }
//}
//
//class MyDate implements Comparator<MyDate>{
//   private int year;
//   private int month;
//   private int day;
//
//    public MyDate(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    @Override
//    public int compare(MyDate o) {
//        //先对o1和o2进行类型判断，不是employ则结束
//
//
//                //如果名字相同，比较birthday
//                int year = getYear() - o.getBirthday().getYear();
//                if (year != 0 ){
//                    return year;
//                }
//
//                //比较month
//                int month =getMonth() - o.getBirthday().getMonth();
//                if (month != 0) {
//                    return month;
//                }
//
//                return getDay() - o.getBirthday().getDay();
//    }
//}
//
//class Employ {
//    private String name;
//    private double sal;
//    private MyDate birthday;
//
//    public Employ(String name, double sal, MyDate birthday) {
//        this.name = name;
//        this.sal = sal;
//        this.birthday = birthday;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSal() {
//        return sal;
//    }
//
//    public void setSal(double sal) {
//        this.sal = sal;
//    }
//
//    public MyDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(MyDate birthday) {
//        this.birthday = birthday;
//    }
//
//    @Override
//    public String toString() {
//        return "Employ{" +
//                "name='" + name + '\'' +
//                ", sal=" + sal +
//                ", birthday=" + birthday +
//                '}' + "\n";
//    }
//}
