package homework;

import java.io.*; 

class Employee implements java.io.Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public transient int SSN; 
	// Special behavior 
	public int number; 
	public void mailCheck() { 
		System.out.println("Mailing a check to " + name + " " + address); 
		} 
	}


public class SerializeDemo { 
	public static void main(String [] args) {
		Employee e = new Employee(); 
		e.name = "Billy Joe"; 
		e.address = "1121, 46th St., Brooklyn, 11219"; 
		e.SSN = 11122333; 
		e.number = 101;      
		try { 
			FileOutputStream fos = new FileOutputStream("fX.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(e); 
			out.close(); 
			fos.close(); 
			System.out.printf("Serialized data is saved in fX.txt"); 
			} catch(IOException i) { 
				i.printStackTrace(); 
				}
		}  
	} 
