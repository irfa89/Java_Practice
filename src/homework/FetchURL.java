package homework;

import java.net.*; 
import java.io.*; // Chapter 9, Listing 2 

public class FetchURL { 
	public static void main(String args[]) throws Exception{ 
		int argc = args.length; // Check for valid number of parameters 
		if (argc != 1) { 
			System.out.println ("Syntax :"); 
			System.out.println ("java FetchURL url-string"); 
			return; 
			} // Catch any thrown exceptions 
		try { // Create an instance of java.net.URL
			java.net.URL myURL = new URL ( args[0] ); // Fetch the content, and read from an InputStream 
			InputStream in = myURL.openStream();
			// Buffer the stream, for better/faster performance 
			BufferedInputStream bufIn = new BufferedInputStream(in); // Repeat until end of file 
			for (;;){ 
				int data = bufIn.read(); // Check for EOF 
				if (data == -1) 
					break; 
				else 
					System.out.print ( (char) data ); 
				} // Pause for user 
			System.out.println(); 
			System.out.println ("Hit enter to continue"); 
			System.in.read();
			}
		// MalformedURLException indicates parsing error 
		catch (MalformedURLException mue) {
			System.err.println ("Unable to parse URL!");
			return;
			} // IOException indicates network or I/O error 
		catch (IOException ioe) { 
			System.err.println ("I/O Error : " + ioe); 
			return; }
	}
	

		}
	

