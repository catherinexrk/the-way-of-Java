package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class socket02client {
    public static void main(String[] args) throws IOException{
        Socket socket = null;

        try {
            socket = new Socket(InetAddress.getLocalHost(),9988);//连接本机9988端口
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("客户端返回 = " + socket.getClass());

        //得到和socket对象相关的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());


        /*
        客户端再次向服务端发送信息
        客户端outputStream
        客户端inputStream
         */
        //获取和socket关联的输入流 读取数据(字节) 并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while  ((readLen = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        socket.shutdownInput();


        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
