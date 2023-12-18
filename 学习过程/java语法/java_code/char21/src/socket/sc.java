package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 陶笛
 */
public class sc {
    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在端口号9999端口进行监听，等待连接");
        //有客户端连接，则会返回一个socket对象
        Socket socket = serverSocket.accept();
        System.out.println("socket = " + socket.getClass());

        //通过socket得到输入流
        InputStream inputStream = socket.getInputStream();
        //IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1 ){
            System.out.println(new String(buf,0,readLen));
        }

        //关闭输入流
        inputStream.close();
    }
}
