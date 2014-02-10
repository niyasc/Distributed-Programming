import java.net.*;
import java.io.*;
public class sender
{
	public static void main(String args[])
	{
		if(args.length!=3)
		{
			System.out.println("Syntax : java sender.java receiver-address receiver-port");
		}
		else
		{
			try
			{
				InetAddress receiverhost=InetAddress.getByName(args[0]);
				int receiverport=Integer.parseInt(args[1]);
				String message=args[2];
				DatagramSocket mysocket=new DatagramSocket();
				byte[] buffer=message.getBytes();
				DatagramPacket datagram=new DatagramPacket(buffer,buffer.length,receiverhost,receiverport);
				mysocket.send(datagram);
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
