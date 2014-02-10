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
				mysocket.connect(host,receiverport);
				for(int i=0;i<10;i++)
				{
					System.out.println(mysocket.receiveMessage(receiverport));
					mysocket.sendMessage(host,receiverport,message);
				}
				mysocket.disconnect();
				
				mysocket.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
}
