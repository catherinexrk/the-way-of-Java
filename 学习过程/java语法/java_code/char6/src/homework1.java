public class homework1 {
    public static void main(String[] args) {
        max test = new max();
//        double[] arr = {1,2,3,4,5,6,7,11,34,2};
        double[] arr ;
        arr = new double[]{1,2,3,4,5,4};
        System.out.println("max is " + test.findMax(arr));
    }
}

class max{
    public double findMax(double... nums){
        int max = 0;
        for (int i = 0;i < nums.length;i++){
            if (nums[i] > nums[max])
                max = i;
        }
        return nums[max];
    }
}

class findcharacter {
    public int findindex(char[] arr,char index){
        if (arr.length <= 0)
            return -1;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == index)
                return i;
        }
        return -1;
    }
}

class Book {
    double price;
    public Book(double price){
        this.price = price;
    }
    public void uodatePrice(){
        if (price > 150)
            price = 150;
        else if (price > 100 && price <= 150) {
            price = 100;
        }

    }
}

class A03{
    public int[] copyArray(int[] arr){
        int[] arrNew = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
}

class Circle{
    double radius;
    double PI = 3.14;
    public void showLength(){
        System.out.println(2*PI*radius);
    }

    public void showArea(){
        System.out.println(PI * Math.pow(radius,2));
    }
}
