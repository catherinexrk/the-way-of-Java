package writer;

import java.io.FileWriter;
import java.io.IOException;

public class writer2 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String filePath = "D://text.txt";

        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.write("hello world");
            fileWriter.write("好好学java 研究生转go");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("写入成功");
        }



    }
}
