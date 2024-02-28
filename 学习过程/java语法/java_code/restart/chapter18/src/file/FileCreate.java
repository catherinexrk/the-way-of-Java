package file;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
//        new FileCreate().create01();
//        new FileCreate().create02();
    }


    public void create01(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void create02(){
        File parentName = new File("d:\\");
        String fileName = "news2.txt";
        File file1 = new File(parentName, fileName);

        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void create03(){
        String parentPath = "d:\\";

    }
}
