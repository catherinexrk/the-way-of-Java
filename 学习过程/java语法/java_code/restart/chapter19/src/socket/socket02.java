package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socket02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9988);
        System.out.println("服务端在9988端口进行监听");
        Socket socket = serverSocket.accept();//有端口连接的时候返回对象

        System.out.println("socket = " + socket.getClass());

        //IO读取
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLine = 0;

        while  ((readLine = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLine));//根据读取到的实际长度进行打印
        }

        //获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client".getBytes());

        //关闭流和socket
        inputStream.close();
        serverSocket.close();
        socket.close();
        outputStream.close();
        System.out.println("服务端关闭");



    }
}
