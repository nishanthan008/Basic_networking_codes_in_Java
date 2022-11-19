import java.net.Socket;
import java.io.OutputStream;
import java.io.DataOutputStream;
public class WishesClient
{
public static void main(String args[]) throws Exception
{
Socket sock=new Socket("127.0.0.1",5000);
System.out.println("Client sending wishes to Server");
String message1 = "Happy 2022";
OutputStream oStream = sock.getOutputStream();
DataOutputStream dos = new DataOutputStream(oStream);
dos.writeBytes(message1);
dos.close();
oStream.close();
sock.close();
}
}
