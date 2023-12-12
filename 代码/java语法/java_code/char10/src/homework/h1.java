package homework;

/**
 * @author 陶笛
 */
public class h1 {
    public static void main(String[] args) {
        //验证输入参数个数
        try {
            if (args.length != 2) {
                throw  new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            int res = cal(n1 ,n2);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数形式不对，需要输入整数");
        } catch (ArithmeticException e){
            System.out.println("出现 ÷ 0 的异常");
        }


    }

    public static int cal(int n1,int n2){
        return  n1 / n2;
    }
}


