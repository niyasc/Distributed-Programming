import java.net.*;

public class DaytimeClientHelper1{
	public static String getTimestamp(String hos,int port){
		String timestamp="";
		try{
			InetAddress host=InetAddress.getByName(hos);
			myDatagramSocket mysocket=new myDatagramSocket();
			mysocket.sendMessage(host,port,"");
			timestamp=mysocket.receiveMessage();
			mysocket.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return timestamp;
	}
}
