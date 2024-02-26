package customgeneric;

import java.util.ArrayList;
import java.util.List;

public class generciExtend {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
    }

    public static void printCollection(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
