package outputStream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings("All")
public class outoutStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile(){
        //创建一个fileoutputStream对象
        String filepath = "d:\\hello.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到fileoutputStream对象
            fileOutputStream = new FileOutputStream(filepath,true);
            //写入一个字节
//            fileOutputStream.write('a');

            //写入一个字符串
            String str = "hello world";
            fileOutputStream.write(str.getBytes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}


