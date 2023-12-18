package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 陶笛
 */
public class client {
    public static void main(String[] args) throws IOException {
        //连接防服务器(ip,端口)
        //连接本地的9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端socket返回 = " + socket.getClass());

        //连接上后，生成Socket
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //通过输入流写入数据到数据通道
        outputStream.write("hello server".getBytes());
        //关闭流对象和socket
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");



    }
}
