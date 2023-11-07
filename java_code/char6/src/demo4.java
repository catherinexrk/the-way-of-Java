public class demo4 {
    public static void main(String[] args) {
        C c = new C();
        if (c.isOdd(3)){
            System.out.println("odd number");
        }
        else {
            System.out.println("even number");
        }

        AA aa = new AA();
        aa.func(5,5,'!');
    }
}

class C{
    public boolean isOdd(int num){
        return num % 2 != 0 ? true : false;
    }
}


class AA {
    public void func(int row,int col,char ch){
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}