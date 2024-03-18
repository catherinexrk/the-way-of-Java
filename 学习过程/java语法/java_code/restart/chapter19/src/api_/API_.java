package api_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //根据指定的主机名获取对象

        //根据域名返回InetAdddress对象 www.baidu.com
        InetAddress host = InetAddress.getByName("www.pornhub.com");
        System.out.println(host);

        //根据InetAddress对象获取对应的地址
        String hostAddress = host.getHostAddress();
        System.out.println(hostAddress);

        //通过Inet对象获取主机名 或者返回域名

        /*
        tcp
        udp
        tcp稳定
        udp不稳定
         */

    }
}
