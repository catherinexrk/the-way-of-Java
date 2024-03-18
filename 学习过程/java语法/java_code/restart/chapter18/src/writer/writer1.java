package writer;

import java.io.FileWriter;
import java.io.IOException;

public class writer1 {
    public static void main(String[] args) {
        String filepath = "D:\\note.txt";

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filepath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fileWriter.write('a');
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //对应fileWriter 及时关闭流
            System.out.println("程序结束");
        }
    }
}
