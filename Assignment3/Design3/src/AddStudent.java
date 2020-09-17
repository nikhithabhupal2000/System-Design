import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AddStudent extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws IOException{
		
		PrintWriter pen = resp.getWriter();
		
		try{
		
				ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("myObjects.txt", true)) {
            protected void writeStreamHeader() throws IOException {
                reset();
            }
        };
				int id = Integer.parseInt(req.getParameter("sid"));
				String name = req.getParameter("sname");
				Student student = new Student(id, name);
				o.writeObject(student);
				o.close();
				pen.write("DONE");
		
		
		}catch(Exception e){
			pen.write(e.toString());
		}
		
	}
}
