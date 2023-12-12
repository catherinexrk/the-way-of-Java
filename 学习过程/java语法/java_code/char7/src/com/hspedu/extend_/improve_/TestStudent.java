package com.hspedu.extend_.improve_;

public class TestStudent {
    public static void main(String[] args) {
        Pupile p1 = new Pupile();
        p1.setAge(18);
        p1.setName("小明");
        p1.setScore(19);
        p1.testing();

        Graduate p2 = new Graduate();
        p2.setName("大明");
        p2.setScore(19);
        p2.testing();
    }
}
