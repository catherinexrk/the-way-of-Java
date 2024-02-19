package Map;

import java.util.HashMap;

@SuppressWarnings({"all"})
public class ecercise2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i,"hello");
        }
        System.out.println(hashMap);
    }
}
