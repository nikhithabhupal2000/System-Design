import java.net.*;
import java.util.*;
import java.io.*;
public class LoadBalancer{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the port number");
		int port = ip.nextInt();
		ArrayList<Integer> ports = new ArrayList<>();
		ports.add(8787);
		ports.add(8888);
		ports.add(6868);
		try{
			ServerSocket server = new ServerSocket(port);
			while(true){
			Socket socket = server.accept();
			int current = ports.get(0);
			ports.remove(0);
			ports.add(current);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = in.readLine();
			Socket s = new Socket("127.0.0.1", current);
			System.out.println("Sent to server");
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);
			out.println(line);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
