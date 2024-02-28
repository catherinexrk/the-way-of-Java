package inputStream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() throws IOException {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);//创建fileInputStream对象，用于读取文件
        int read = 0;
        try {

            while ((read = fileInputStream.read()) != -1){
                System.out.print((char) read);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流文件 释放资源
            fileInputStream.close();
        }
    }

    @Test
    public void readFile02() throws IOException {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;//创建fileInputStream对象，用于读取文件
        int read = 0;

        //字节数组
        byte[] buf = new byte[8];//一次读取8个字节
        int readLen = 0;

        try {
            fileInputStream = new FileInputStream(filePath);

            //如果返回-1 表示读取完毕
            //如果读取正常 返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0, readLen)); //显示
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流文件 释放资源
            fileInputStream.close();
        }
    }
}
