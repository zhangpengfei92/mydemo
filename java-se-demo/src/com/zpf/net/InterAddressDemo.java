package com.zpf.net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;

public class InterAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress =InetAddress.getLocalHost();
            System.out.println("本机地址:"+inetAddress);
            System.out.println(inetAddress.getAddress());
            System.out.println("获取此IP地址的完全限定域名:"+inetAddress.getCanonicalHostName());
            System.out.println("返回文本显示中的IP地址字符串:"+inetAddress.getHostAddress());
            System.out.println("获取此IP地址的主机名(域名):"+inetAddress.getHostName());
            System.out.println("检查InetAddress是否是IP组播地址的实用程序:"+inetAddress.isMulticastAddress());
            System.out.println("检查通配符地址中的InetAddress的实用程序:"+inetAddress.isAnyLocalAddress());
            System.out.println("检查通配符地址中的InetAddress的实用程序:"+inetAddress.isLoopbackAddress());
            System.out.println("返回回送地址(本机地址127.0.0.1):"+inetAddress.getLoopbackAddress());
            System.out.println("----------------------------------");
            InetAddress inetAddress1 = InetAddress.getByName("www.zpfworld.xyz");
            System.out.println("网站www.zpfworld.xyz的域名ip:"+inetAddress1);
            System.out.println("获取此IP地址的完全限定域名:"+inetAddress1.getCanonicalHostName());
            System.out.println("返回文本显示中的IP地址字符串:"+inetAddress1.getHostAddress());
            System.out.println("获取此IP地址的主机名:"+inetAddress1.getHostName());
            System.out.println("返回回送地址(本机地址127.0.0.1):"+inetAddress1.getLoopbackAddress());

            System.out.println("----------------------------------");
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println("网站www.baidu.com的域名ip:"+inetAddress2);
            System.out.println("获取此IP地址的完全限定域名:"+inetAddress2.getCanonicalHostName());
            System.out.println("返回文本显示中的IP地址字符串:"+inetAddress2.getHostAddress());
            System.out.println("获取此IP地址的主机名:"+inetAddress2.getHostName());
            System.out.println("返回回送地址(本机地址127.0.0.1):"+inetAddress2.getLoopbackAddress());
            System.out.println("返回此IP地址的哈希码:"+inetAddress2.hashCode());
            System.out.println("检查通配符地址中的InetAddress的实用程序。 :"+inetAddress2.isAnyLocalAddress());
            System.out.println("检查InetAddress是否是链接本地地址的实用程序:"+inetAddress2.isLinkLocalAddress());
            System.out.println("检查InetAddress是否是一个环回地址的实用程序:"+inetAddress2.isLoopbackAddress());
            System.out.println("检查多播地址是否具有全局范围的实用程序:"+inetAddress2.isMCGlobal());
            System.out.println("检查组播地址是否具有链路范围的实用程序:"+inetAddress2.isMCLinkLocal());
            System.out.println("检查多播地址是否具有节点范围的实用程序:"+inetAddress2.isMCNodeLocal() );
            System.out.println("检查组播地址是否具有组织范围的实用程序:"+inetAddress2.isMCOrgLocal());
            System.out.println("检查多播地址是否具有站点范围的实用程序:"+inetAddress2.isMCSiteLocal());
            System.out.println("检查InetAddress是否是IP组播地址的实用程序:"+inetAddress2.isMulticastAddress());
            System.out.println("测试该地址是否可达:"+inetAddress2.isReachable(10000));
            System.out.println("测试该地址是否可达:"+inetAddress2.isReachable(NetworkInterface.getByInetAddress(InetAddress.getByName("192.168.3.115")),1,1000));
            System.out.println("检查InetAddress是否是站点本地地址的实用程序:"+inetAddress2.isSiteLocalAddress());
            System.out.println("检查InetAddress是否是站点本地地址的实用程序:"+inetAddress2.isSiteLocalAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
