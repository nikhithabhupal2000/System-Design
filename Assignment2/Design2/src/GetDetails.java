import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class GetDetails extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  throws IOException{
		
		PrintWriter pen = resp.getWriter();
		
		for(Map.Entry<Integer, String> stud : SharedData.students.entrySet()){
		
			pen.write(stud.getKey() + "    " + stud.getValue() + " \n");
			
		}
		
		
		
	}
}
