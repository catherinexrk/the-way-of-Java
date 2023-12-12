package abstract_;

public class BB extends Template{
    //计算任务
    //1 +   + 10000

    @Override
    public void job() {
        long num = 0;
        for (int i = 1; i < 80000; i++) {
            num *= i;
        }
    }
}
