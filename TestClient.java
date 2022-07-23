import java.net.*;
import java.io.*;
public class TestClient
{
public static void main(String args[])throws Exception{
Socket sock = new Socket("localhost",5000);

BufferedReader KeyRead = new  BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream();
InputStream istream = sock.getInputStream();
PrintWriter pwrite = new PrintWriter(ostream,true);
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
System.out.println("start the chitchat progam  and press type enter ");
String receiveMessage ,sendMessage;
while(true){
  sendMessage = KeyRead.readLine();
  pwrite.println(sendMessage);
	pwrite.flush(); 
	if((receiveMessage = receiveRead.readLine()) != null)
	{
   System.out.println(receiveMessage);
	}
}
}
}
