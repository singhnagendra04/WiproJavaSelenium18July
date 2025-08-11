package IO;
import java.io.*;

public class ByteArrayInputStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte []arr = {1,2,5,8,9};
		
		try {
			
			ByteArrayInputStream input = new ByteArrayInputStream(arr);
			for(int i=0;i<arr.length;i++) {
				int data = input.read();
				System.err.println(data);
			}
			
			input.close();
		} catch(Exception e){
			System.out.println(e);
		}

	}

}
