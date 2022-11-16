import java.io.*;
import java.net.*;
class Address {
public InetAddress ip;
public static void main(String args[]) throws UnknownHostException
{
InetAddress ip = InetAddress.getLocalHost();
System.out.println("IP Address:"+ip);
String s1 = ip.getHostName();
System.out.println("System no is:" +s1);
}
}
