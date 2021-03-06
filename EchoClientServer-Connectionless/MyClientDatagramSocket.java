import java.io.*;
import java.net.*;

public class MyClientDatagramSocket extends DatagramSocket{
	
	final int MAX_LEN = 10;
	MyClientDatagramSocket(int port) throws SocketException{
		super(port);
	}
	
	MyClientDatagramSocket() throws SocketException{
		super();
	}
	
	public void sendMessage(InetAddress receiverHost, int receiverPort, String message) throws IOException{
			byte[] sendBuffer = message.getBytes();
			DatagramPacket packet = new DatagramPacket(sendBuffer, sendBuffer.length, receiverHost, receiverPort);
			this.send(packet);
	}
	
	public String receiveMessage() throws IOException{
		byte[] receiveBuffer = new byte[MAX_LEN];
		DatagramPacket packet = new DatagramPacket(receiveBuffer, MAX_LEN);
		this.receive(packet);
		return (new String(receiveBuffer));
	}
	
}
