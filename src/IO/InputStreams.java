package IO;

import java.io.FileInputStream;

public class InputStreams {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileInputStream input = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\hello.txt");
	 
			System.out.println("Data in the file");
			
			int i = input.read();
			while( i != -1) {
				System.out.println((char) i);
				
				i= input.read();
			}
			
			input.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		

	}

}
