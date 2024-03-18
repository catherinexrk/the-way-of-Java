package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_ {
    public static void main(String[] args) {
        String filePath = "D:\\a.java";
        try {
            //创建一个bufferWriter对象
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("hello world");
            //插入一个换行符
            bufferedWriter.newLine();
            bufferedWriter.write("test 换行");

            /*
            序列化，我计算是2025年考研究生，到时候读个211研究生，然后研究生期间转别的方向，到时候毕业找一份合肥本地的工作

            序列化
             */

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
