import java.net.*;
import java.io.*;
public class receiver
{
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Syntax : java sender.java receiver-port");
		}
		else
		{
			try
			{
				int MAX=40;
				int receiverport=Integer.parseInt(args[0]);
				DatagramSocket mysocket=new DatagramSocket(receiverport);
				byte buffer[]=new byte[100];
				DatagramPacket datagram=new DatagramPacket(buffer,100);
				mysocket.receive(datagram);
				String message= new String(buffer);
				System.out.println(message);
				mysocket.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
			}
		}
	}
}
