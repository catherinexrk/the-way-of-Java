package date;

public class homework1 {
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(str);
        String str1 = null;
        try {
            str1 = reverse(str,2,324344);
        } catch (Exception e) {
            System.out.println("出现错误");
            return;
        }
        System.out.println(str1);
    }

    //元素反转
    public static String reverse(String str,int start,int end){
        char[] arr = str.toCharArray();
        char temp = ' ';
        for (int i = start,j = end; i < j; i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }
}
