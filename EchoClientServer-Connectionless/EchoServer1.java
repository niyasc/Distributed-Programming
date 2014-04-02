import java.io.*;

public class EchoServer1{
	public static void main(String args[]){
		int serverPort = 2048;
		if(args.length == 1)
			serverPort = Integer.parseInt(args[0]);
		try{
			MyServerDatagramSocket mysocket = new MyServerDatagramSocket(serverPort);
			System.out.println("Echo server ready");
			while(true){
				DatagramMessage request = mysocket.receiveMessageAndSender();
				System.out.println("Request received");
				System.out.println("Received Message " + request.getMessage());
				mysocket.sendMessage(request.getAddress(), request.getPort(), request.getMessage());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
