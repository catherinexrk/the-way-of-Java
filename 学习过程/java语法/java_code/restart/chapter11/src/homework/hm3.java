package homework;

public class hm3 {
    public static void main(String[] args) {
        cellPhone cellPhone = new cellPhone();
        cellPhone.testWork(new Icalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);
    }
}

interface Icalculate{
    //work方法 完成计算
    //至于该方法完成怎么样的计算交给匿名内部类完成
    public double work(double n1,double n2);
}

class cellPhone{
    //当调用testwork方法时，直接传入一个实现接口ic的匿名内部类即可
    public void testWork(Icalculate icalculate,double n1,double n2){
        double result = icalculate.work(n1,n2);
        System.out.println("计算后的结果是 = " + result);
    }
}
