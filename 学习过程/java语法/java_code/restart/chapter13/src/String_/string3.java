package String_;

public class string3 {
    public void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str + " and  " + ex.ch);
    }
}

class Test1{
    String str = new String("hsp");
    final char[] ch= {'j','a','v','a'};

    public void change(String str,char[] ch){
        str = "hgahhaha";
        ch[0] = 'a';
    }
}