package outputStream;

import file.FileCreate;

import java.io.*;

public class fileCopy {
    public static void main(String[] args) throws IOException {
        //完成文件拷贝
        //创建文件输入流 将文件拷贝到程序中
        //创建文件输出流 将拷贝内容赋
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {


            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream("d:\\hellow.txt");
            //定义一个字节数组 提高读取效率
            byte[] buf = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1){
                //读取到后 写入文件
                //边读边写
                fileOutputStream.write(buf,0,readlen);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null){
                fileInputStream.close();
            }
            if (fileOutputStream != null){
                fileOutputStream.close();
            }
        }
    }


}
