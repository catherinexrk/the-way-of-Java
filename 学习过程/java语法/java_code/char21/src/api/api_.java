package api;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.UnknownHostException;

/**
 * @author 陶笛
 */
public class api_ {
    public static void main(String[] args) throws UnknownHostException {

        //获取本机inetaddress对象
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);

        System.out.println("主机名 = " + localhost.getHostName());

        InetAddress host1 = InetAddress.getByName("Rogers");
        System.out.println(host1);
    }
}
