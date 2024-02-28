package file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FIleFormation {
    public static void main(String[] args) {
        new FIleFormation().info();
    }

    @Test
    //获取文件信息
    public void info(){
        //先创建文件对象
        File file = new File("d:\\news1.txt");

        //调用相应方法获取对应信息
        System.out.println(file.getName());
//        file.mkdir() 创建一级目录
//        file.mkdirs() 创建多级目录

    }
}
