package homework;

/**
 * @author 陶笛
 */
public class h2 {
    public static void main(String[] args) {
        String name = "helsadasdl";
        String pwd = "123456";
        String email = "helloworldxrk@gmail.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("bingo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name,String pwd,String email){

        //名字长度
        int length = name.length();
        if (!(length >= 2 && length <= 4)){
            throw new RuntimeException("用户名长度不对");
        }

        //密码长度为6且全部为数字
        //单独写一个方法用于判断字符串是否为数字组成
        if (!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码格式不争取");
        }

        //email
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)){
            throw new RuntimeException("邮箱格式异常");
        }

        System.out.println("格式全部通过！");

    }

    public static boolean isDigital(String pwd){
        char[] chars = pwd.toCharArray();
        for (int i  = 0 ; i < chars.length ; i++){
            if (chars[i] < '0' || chars[i] > '9' ){
                return false;
            }
        }
        return true;
    }
}
