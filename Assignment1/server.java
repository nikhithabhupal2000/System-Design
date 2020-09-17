import java.io.*;
import java.net.*;
import java.util.*;
public class server{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the port number");
		int port = ip.nextInt();
		try{
			ServerSocket server = new ServerSocket(port);
			System.out.println("waiting for client.......");
			while(true){
			Socket socket = server.accept();
			System.out.println("Conneceted");
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = in.readLine();
		     	System.out.println(line);	
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
