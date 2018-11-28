import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientUDP
{
    public void startClient() throws IOException
    {
        DatagramSocket socket = null;
        Scanner in = new Scanner(System.in);
        try
        {
            byte[] buf = new byte[512];
            char[] variables = {'x','y','z'};
            String values = "";

            socket = new DatagramSocket();
            for (char var : variables)
            {
                System.out.print("Input " + var + ": ");
                values += in.nextLine() + " ";
            }
            buf = values.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(buf,buf.length,
                    InetAddress.getByName("127.0.0.1"), ServerUDP.PORT);
            socket.send(sendPacket);
            DatagramPacket recvPacket = new DatagramPacket(buf,buf.length);
            socket.receive(recvPacket);
            String answer = new String(recvPacket.getData());
            System.out.println("Answer: " + answer);
        }
        finally
        {
            if(socket != null)
                socket.close();
        }
    }

    public static void main(String[] args)
    {
       try
        {
            ClientUDP clientUDP = new ClientUDP();
            clientUDP.startClient();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
