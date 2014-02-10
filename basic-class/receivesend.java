import java.net.*;
import java.io.*;

public class receivesend
{
	public static void main(String args[])
	{
		if(args.length!=4)
		{
			System.out.println("Syntax error");
		}
		else
		{
			try
			{
				InetAddress host=InetAddress.getByName(args[0]);
				int receiverport=Integer.parseInt(args[1]);
				int myport=Integer.parseInt(args[2]);
				String message=args[3];
				myDatagramSocket mysocket=new myDatagramSocket(myport);
				System.out.println(mysocket.receiveMessage(receiverport));
				mysocket.sendMessage(host,receiverport,message);
				
				mysocket.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
}
