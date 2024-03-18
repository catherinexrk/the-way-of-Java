package transformation;

import java.io.*;

public class codeQuestion {
    public static void main(String[] args) throws Exception{
        //中文乱码问题
        //读取盘符下的文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\helloworld.txt"));

        String s = bufferedReader.readLine();
        System.out.println(s);

        String filePath = "d:\\a.txt";
        InputStream isr = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        }

    }
}
