package exception.homework;

public class homework1 {
    public static void main(String[] args) {

        try {
            //先验证输入参数的个数是否正确
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //将得到的数转换成整数
            //可能存在类型转换错误，因此这里也要进行catch
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);


            //计算结果可能存在算数异常
            double res = cal(n1,n2);

            System.out.println("res = " + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("参数格式不对，需要输入整数");
        } catch (ArithmeticException e){
            System.out.println("出现了算数异常");
        }
    }

    //编写cal方法，就是两个数的商
    public static double cal(int n1,int n2){
        return (double) n1 /n2;
    }
}


