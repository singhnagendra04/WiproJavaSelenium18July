package IO;

import java.io.*;
public class FilterOutputStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileOutputStream s = null;
	        
	        FilterOutputStream filter = null;
	        
	        try {
	        	
	        	// create file input stream for the file
	        	s = new FileOutputStream("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\hello.txt");
	        	
	        	// wrap file input  stream with buffered input
	        	filter = new BufferedOutputStream(s);
	        	
	        	//read and print the file content
	        	String text = "Hi who are you";
	        	filter.write(text.getBytes());
	        	
	        	
	        } catch(Exception e) {
	        	System.out.println(e);
	        	
	        }finally {
	        	filter.close();
	        	s.close();
	        }

	}

}
