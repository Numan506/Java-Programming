import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author jakar
 */
public class Client
{

 private static Socket socket;

 public static void main(String args[])
    {
        try
        {
 String host = "localhost";
       int port = 40000;
    InetAddress address = InetAddress.getByName(host);
  socket = new Socket(address, port);

  OutputStream os = socket.getOutputStream();
      OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

  String numbers = "Hello";
 String sendMessage = numbers + "\n";
    bw.write(sendMessage);
    bw.flush();
    System.out.println("Message sent to the Client : "+sendMessage);

 //Get the return message from the server
  InputStream is = socket.getInputStream();
  InputStreamReader isr = new InputStreamReader(is);
  BufferedReader br = new BufferedReader(isr);
   String number = "Hi";
  String message = number + "\n";
  bw.write(message);
  bw.flush();
 System.out.println("Message received from the server : " +message);
        }
 catch (IOException exception)
        {
        }
        finally
        {
      //Closing the socket
            try
            {
             socket.close();
            }
       catch(IOException e)
            {
            }
        }
    }
}

