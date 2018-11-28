import java.io.*;
import java.net.*;

public class ServerUDP
{
    public static final int PORT = 4763;
    public final String FILE_PATH = "D:\\part2.txt";

    public void startServer() throws IOException
    {
        DatagramSocket socket = null;
        FileWriter fileWriter = null;
        try
        {
            boolean stopflag = false;
            byte[] buf = new byte[512];
            socket = new DatagramSocket(PORT);
            System.out.println("Server started!");
            while(!stopflag)
            {
                DatagramPacket recvPacket = new DatagramPacket(buf,buf.length);
                socket.receive(recvPacket);

                String values = new String(recvPacket.getData()).trim();
                System.out.println("Values: " + values);
                String[] arrValues = values.split(" ");
                int[] vars = new int[arrValues.length];

                for (int i = 0; i < arrValues.length; i++)
                    vars[i] = Integer.parseInt(arrValues[i]);
		double x = var[0];
		double y = var[1];
		double z = var[2];
                double result = 6 + Math.exp(x - Math.sin(y)) / (y + Math.tan(x * x) / (y + Math.pow(x, 7) / z)) * Math.pow(1 + Math.pow(Math.ctan(z) / 100), Math.sqrt(Math.abs(y) + 3);
                System.out.println("Result: " + result);

                String resultString = Double.toString(result);
                buf = resultString.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(buf,buf.length,recvPacket.getAddress(),recvPacket.getPort());
                socket.send(sendPacket);

                fileWriter = new FileWriter(FILE_PATH,true);
                fileWriter.write(values + " " + resultString + "\n");
                stopflag = true;
            }
            System.out.println("Server stopped!");
        }
        finally
        {
            if (socket != null)
                socket.close();
            if(fileWriter != null)
                fileWriter.close();
        }
    }

    public static void main(String[] args)
    {
        try
        {
            ServerUDP serverUDP = new ServerUDP();
            serverUDP.startServer();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
