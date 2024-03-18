package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socket01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(9999);

        System.out.println("服务器在端口999进行监听，等待连接");

        Socket socket = serversocket.accept();//有客户端连接时返回对象

        System.out.println("socket = " + socket.getClass());

        InputStream inputStream = socket.getInputStream();
        //IO读取
        byte[] buf = new byte[1024];
        int read = 0;
        while ( (read = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,read));//根据读取到的实际长度显示内容
        }

        //关闭流和socket
        inputStream.close();
        socket.close();
        serversocket.close();

        System.out.println("服务端关闭");
    }
}
