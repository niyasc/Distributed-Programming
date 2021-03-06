import java.net.*;

public class DatagramMessage{
	private String message;
	private InetAddress senderAddress;
	private int senderPort;
	
	public void putVal(String message, InetAddress senderAddress, int senderPort){
		this.message = message;
		this.senderAddress = senderAddress;
		this.senderPort = senderPort;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public InetAddress getAddress(){
		return this.senderAddress;
	}
	
	public int getPort(){
		return this.senderPort;
	}
}
	
