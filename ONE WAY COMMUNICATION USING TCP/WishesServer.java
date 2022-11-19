import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.DataInputStream;
public class WishesServer
{
public static void main(String args[]) throws Exception
{
ServerSocket sersock = new ServerSocket(5000);
System.out.println("server is ready");
Socket sock= sersock.accept();
InputStream iStream = sock.getInputStream();
DataInputStream dStream = new DataInputStream(iStream);
String message2 = dStream.readLine();
System.out.println(message2);
dStream.close(); iStream.close(); 
sock.close(); sersock.close();
}
}
