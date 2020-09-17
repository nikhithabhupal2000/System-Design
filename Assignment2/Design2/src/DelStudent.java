import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DelStudent extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws IOException{
	
		int id = Integer.parseInt(req.getParameter("sid"));
		
		PrintWriter pen = resp.getWriter();
		
		SharedData.students.remove(id);
		
		pen.write("DONE");
		
		
	}
}
