package lab.ONEAUGUST;

import java.io.*;
public class ReadContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\hello.txt");
			 
			System.out.println("Data in the file");
			
			int i = input.read();
			while( i != -1) {
				System.out.print((char) i);
				
				i= input.read();
			}
			
			input.close();
			
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
