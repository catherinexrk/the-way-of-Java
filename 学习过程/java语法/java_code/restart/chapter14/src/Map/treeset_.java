package Map;

import java.util.Comparator;
import java.util.TreeSet;

public class treeset_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });

        treeSet.add("jack");
        treeSet.add("jk");
        treeSet.add("jaadsdack");
        treeSet.add("jacksd");

        System.out.println(treeSet);

    }
}
