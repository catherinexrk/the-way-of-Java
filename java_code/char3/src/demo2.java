public class demo2 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;//temp = i  i = i+1 i = temp
        System.out.println(i);

        int j = 1;
        j = ++j;// i = i + 1 temp = i  i = temp
        System.out.println(j);
    }
}
