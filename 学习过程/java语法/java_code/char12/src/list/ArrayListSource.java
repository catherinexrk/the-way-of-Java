package list;

import java.util.ArrayList;

/**
 * @author 陶笛
 */
public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for (int i = 0;i <= 10 ;i++){
            list.add(i);
        }

        for (int i = 11;i <= 15; i++){
            list.add(i);
        }

        list.add(100);
        list.add(200);
    }
}
