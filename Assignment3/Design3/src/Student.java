import java.util.*;
import java.io.*;
public class Student implements Serializable{

	int sid;
	String sname;
	
	Student(int id,String name){
		this.sid = id;
		this.sname = name;
	}
	public String toString(){
		return this.sid + "   " + this.sname;
	}
}