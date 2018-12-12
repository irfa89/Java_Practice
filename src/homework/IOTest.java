package homework;

import java.io.*; // Needed for PrintStream.println(java.lang.String)

public class IOTest {   
	public static void main(String arg[]) { 
		try  { 
			byte bArray[] = new byte[128]; 
			System.out.println("Enter something:"); 
			System.in.read(bArray);
String s = new String(bArray, 0);
System.out.println(s); 
} catch(IOException ioe) {
	System.out.println(ioe.toString() ); 
	ioe.printStackTrace(); }
}
}