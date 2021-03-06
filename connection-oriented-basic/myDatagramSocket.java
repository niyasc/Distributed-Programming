import java.net.*;
import java.io.*;

public class myDatagramSocket extends DatagramSocket
{
	final static int MAXLEN=10;
	myDatagramSocket(int port) throws SocketException
	{
		super(port);
	}
	public void sendMessage(InetAddress host,int port,String message) throws IOException
	{
		byte[] buffer=message.getBytes();
		DatagramPacket datagram=new DatagramPacket(buffer,buffer.length,host,port);
		this.send(datagram);
	}
	public String receiveMessage(int port) throws IOException
	{
		byte[] buffer=new byte[MAXLEN];
		DatagramPacket datagram=new DatagramPacket(buffer,MAXLEN);
		this.receive(datagram);
		String message=new String(buffer);
		return message;
	}
};
