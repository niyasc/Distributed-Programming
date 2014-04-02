import java.io.*;
import java.net.*;

public class MyStreamSocket extends Socket{
	private Socket socket;
	private BufferedReader input;
	private PrintWriter output;
	
	MyStreamSocket(InetAddress host,int port) throws SocketException,IOException{
		socket=new Socket(host,port);
		setStreams();
	}
	
	MyStreamSocket(Socket socket) throws IOException{
		this.socket=socket;
		setStreams();
	}
	
	private void setStreams() throws IOException{
		InputStream is=socket.getInputStream();
		OutputStream os=socket.getOutputStream();
		output=new PrintWriter(new OutputStreamWriter(os));
		input=new BufferedReader(new InputStreamReader(is));
	}
	
	public void sendMessage(String message) throws IOException{
		output.println(message);
		output.flush();
	}
	
	public String receiveMessage() throws IOException{
		return input.readLine();
	}
}
	
