import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AddStudent extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws IOException{
	
		int id = Integer.parseInt(req.getParameter("sid"));
		String name = req.getParameter("sname");
		
		PrintWriter pen = resp.getWriter();
		
		SharedData.students.put(id, name);
		
		pen.write("DONE");
		
	}
}
