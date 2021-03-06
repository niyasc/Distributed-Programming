import java.net.*;
import java.io.*;

public class myDatagramSocket extends DatagramSocket{
	myDatagramSocket() throws SocketException{
		super();
	}
	myDatagramSocket(int port) throws SocketException{
		super(port);
	}
	
	public void sendMessage(InetAddress host,int port,String message) throws IOException{
		byte buffer[]=message.getBytes();
		DatagramPacket datagram=new DatagramPacket(buffer,buffer.length,host,port);
		this.send(datagram);
	}
	
	public String receiveMessage() throws IOException{
		int MAXLEN=20;
		byte buffer[]=new byte[MAXLEN];
		DatagramPacket datagram=new DatagramPacket(buffer,MAXLEN);
		this.receive(datagram);
		return new String(buffer);
	}
}
	
