import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class GetDetails extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  throws IOException{
		
		PrintWriter pen = resp.getWriter();
		
		StringBuffer sol = new StringBuffer("");
		
		try{
		
				FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
				ObjectInputStream oi = new ObjectInputStream(fi);
				boolean flag = true;
				while(flag){
					Student s = (Student) oi.readObject();
					if(s == null){
						break;
					}
					sol.append(s.toString() + " \n");
				}
				oi.close();
				fi.close();
		
		
		}catch(Exception e){
			pen.write(sol.toString()	);
		}
		
	}
}
