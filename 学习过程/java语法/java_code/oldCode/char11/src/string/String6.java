package string;

/**
 * @author 陶笛
 */
public class String6 {
    public static void main(String[] args) {
        String str = "aaabcsadadqdasdaxzxzcsdfadcad11";
        System.out.println(str.indexOf('1'));

        String str2 = "hell oworld";
        System.out.println(str2.substring(2,5)); //截取位置2到4位置的元素 ll ;

        String str3 = "aaa b c asd  asd sd";
//        str3 = str3.replace("aaa","test");
        System.out.println(str3);
        System.out.println(str3.replace("aaa" , "test"));

        String str4 = "hello world";
        char[] array = str3.toCharArray();
        for (char temp : array)
            System.out.println(temp);
    }
}
