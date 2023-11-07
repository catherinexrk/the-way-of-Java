public class arrayTest {
    public static void main(String[] args) {
        char[] character = new char[26];
//        for(char start = 'A';start <= 'Z';start++) {
//            character[i] = start;
//        }

        char[] letter = new char[26];
        for(int i = 0;i < 26;i++){
            letter[i] = (char)(i +'A');
        }

        for(int i = 0 ;i < character.length; i++){
            System.out.println(character[i]);
            System.out.println(letter[i]);
        }
    }
}
