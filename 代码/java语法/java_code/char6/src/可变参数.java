public class 可变参数 {
    public static void main(String[] args) {
        VaryMethod test = new VaryMethod();
        test.func(1,2,3);
        test.func();
    }
}


class VaryMethod{
    public void func(int... nums){
        System.out.println("接受参数个数 = " + nums.length);
        for (int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
