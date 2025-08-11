package IO;

import java.io.*;
public class FilterInputStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//filter streams folder data as they read and write data in input streams
//		filters it and pass it on to the underlying streams
		
        FileInputStream s = null;
        
        FilterInputStream filter = null;
        
        try {
        	
        	// create file input stream for the file
        	s = new FileInputStream("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\hello.txt");
        	
        	// wrap file input  stream with buffered input
        	filter = new BufferedInputStream(s);
        	
        	//read and print the file content
        	int data;
        	while((data = filter.read()) != -1) {
        		System.out.print((char)data);
        	}
        	
        	
        } catch(Exception e) {
        	System.out.println(e);
        }
	}

}
