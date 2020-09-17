import java.util.*;
import java.io.*;
import java.net.*;
public class client{
	public static void main(String[] args){
		int port = 9090;
		Scanner ip = new Scanner(System.in);
		//server port = 8989
		try{
			Socket socket = new Socket("127.0.0.1", 8989);
			System.out.println("Enter message");
			String line = ip.nextLine();
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(line);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
