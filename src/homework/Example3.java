package homework;

import static java.lang.System.out; 

class Example3 { 
	public static void errorFunc() throws Exception{ 
		out.println("errorFunc");
		throw new Exception("Exception!");
	}
	
public static void normalFunc() throws Exception{
	out.println("normalFunc");
	errorFunc();
}
	
public static void main(String[] args) throws Exception { 
	try { 
		normalFunc();
	}
		finally { 
		out.println("finally statement"); 
		} 
		out.println("after try block");
	}

}  
	
