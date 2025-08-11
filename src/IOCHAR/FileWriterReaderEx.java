package IOCHAR;

import java.io.*;

public class FileWriterReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\hello1.txt");

		fw.write("I am the file writer");
		
		fw.close();
		
		
		FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\hello1.txt");
	
	    int i;
	    while((i = fr.read()) != -1) {
	    	
	    	System.out.print((char)i);
	    	
	    }
	    
	    fr.close();
	
	
	
	}

}
