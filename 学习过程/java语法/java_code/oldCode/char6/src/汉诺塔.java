public class 汉诺塔 {
    public static void main(String[] args) {
        hannuota t = new hannuota();
        t.func(3,'a','b','c');
    }
}

class hannuota{
    //num 为 移动的个数
    public void func(int num,char a,char b,char c){
        if (num == 1){
            System.out.println(a + " -> " + c);
        } else  {
            //分成两个盘子
            //上面的num-1借助c移动到b
            func(num - 1,a,c,b);
            //最后一个盘直接从a移动到c
            System.out.println(a + " -> " + c);
            //把num - 1盘子借助a移动到c
            func(num - 1,b,a,c);
        }
    }
}
