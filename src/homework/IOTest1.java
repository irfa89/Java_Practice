package homework;

import java.io.*; 
public class IOTest1  {   
	public static void main(String arg[]) { 
		try  { 
			byte bArray[] = new byte[128]; 
			System.out.println("Enter something:");
System.in.read(bArray); 
System.out.println("You entered:"); 
System.out.println(bArray);
Class InClass = System.in.getClass(); 
Class OutClass = System.out.getClass(); 
System.out.println("in is "  + InClass.toString() );
System.out.println("out is " + OutClass.toString() );
} catch(IOException ioe) {   
	System.out.println(ioe.toString() ); 
	ioe.printStackTrace(); }
}
}