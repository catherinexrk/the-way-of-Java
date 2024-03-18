package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader_ {
    public static void main(String[] args) {
        String filePath = "D:\\a.java";
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(filePath));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //读取
        String line;//按行读取

        try {
            while ((line = bufferReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bufferReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
