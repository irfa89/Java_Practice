package homework;

import static java.lang.System.out; 

class Example2 { 
	public static void normalFunc() { 
		out.println("normalFunc"); 
	}
	

public static void main(String[] args) { 
	try { 
		errorFunc(); 
		normalFunc(); // Never gets called! 
		} catch (Exception e) { 
			out.println("catch for exception"); 
		} finally { 
		out.println("finally statement"); 
		} // Execution resumes here. out.prin
	// Execution resumes here. 
		out.println("after try block");
	}


private static void errorFunc() {
	// TODO Auto-generated method stub
	
} 
}  
	
