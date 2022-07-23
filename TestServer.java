import java.net.*;
import java.io.*;
public class TestServer
{
public static void main(String args[]) throws Exception{
ServerSocket sersoc = new ServerSocket(5000);
System.out.println("System is ready to chat ");
Socket sock = sersoc.accept();
BufferedReader KeyRead = new  BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream(); 
PrintWriter 
pwrite = new PrintWriter(ostream,true);
InputStream istream = sock.getInputStream();
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
String receiveMessage ,sendMessage;
while(true){
if((receiveMessage = receiveRead.readLine())!=null) 
{
   System.out.println("" + receiveMessage);
}
sendMessage = KeyRead.readLine();
pwrite.println("send message " + sendMessage);
pwrite.flush(); 
}
}
}