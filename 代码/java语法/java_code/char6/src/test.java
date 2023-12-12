public class test {
    public static void main(String[] args) {
        //1
        int[] a = new int[10];
        int b[] = new int[10];

        //2
        int[] c;
        c = new int[10];

        //3
        char[] character = new char[26];
        for (int i = 0;i < character.length;i++ ){
            character[i] = (char) ('A' + i);
        }


        for(int i = 0;i < character.length;i++){
            System.out.print(character[i] + " ");
        }
        System.out.println();

        String str1 = "hello world";
        String str2 = "hello world";
        System.out.println(str2.equals(str1));

        int[][] arr = new int[3][];
        for (int i = 0;i < arr.length;i++){
            arr[i] = new int[i+1];
            for (int j = 0;j < arr[i].length;j++){
                arr[i][j] = i+j;
            }
        }

        for (int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
