package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class socket01client {
    public static void main(String[] args)  throws IOException{
//        ServerSocket serverSocket = new ServerSocket();
        //连接本机的9999端口
        Socket socket = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //如果连接成功，返回socket对象
        System.out.println("客户端 socket 返回" + socket.getClass());

        //得到和socket对象相关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //通过输出流写入数据到数据通道
        outputStream.write("hello server".getBytes());

        //关闭流对象和socket
        outputStream.close();
        socket.close();

        System.out.println("客户端关闭");

    }
}
