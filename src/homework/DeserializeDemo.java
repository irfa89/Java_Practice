package homework;

import java.io.*; 

class Employee implements java.io.Serializable { 
	public String name;
	public String address;
	public transient int SSN; 
	// Special behavior 
	public int number; 
	public void mailCheck() { 
		System.out.println("Mailing a check to " + name + " " + address); 
		} 
	}

public class DeserializeDemo { 
	public static void main(String [] args) { 
		Employee e = null; 
		try { 
			FileInputStream fis = new FileInputStream("fX.txt");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			e = (Employee)ois.readObject(); 
			ois.close();            
			// Close the last first 
			fis.close();  
			}
		catch(IOException i) { 
			i.printStackTrace(); 
			return;
				}
	catch(ClassNotFoundException c) {    
		System.out.println("Employee class not found");    
		c.printStackTrace(); // Exception object may show RTS 
		return; 
		} 
	System.out.println("Deserialized Employee..."); 
	System.out.println("Name: "    + e.name); 
	System.out.println("Address: " + e.address); 
	System.out.println("SSN: "     + e.SSN); 
	System.out.println("Number: "  + e.number); 
	} 
} 
	
