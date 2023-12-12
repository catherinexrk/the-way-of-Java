package homework;

/**
 * @author 陶笛
 */
public class h1 {
    public static void main(String[] args) {
        String str = "abcde";
        try {
            str = reverse(str,-1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(str);

    }

    public static String reverse(String str,int start,int end){
        if (start >= 0 && end <= str.length()-1) {
            char[] chars = str.toCharArray();
            for(int i = start,j = end ; i < j ; i ++ , j--){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }

            return new String(chars);
        } else {
            throw new RuntimeException("参数不正确");
        }


    }
}
