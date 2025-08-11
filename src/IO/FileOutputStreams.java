package IO;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileOutputStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "I am attending the java training";
		
		try {
			
			FileOutputStream output = new FileOutputStream("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\hello.txt");
			byte []arr = data.getBytes();
			
			output.write(arr);
			
			output.close();
			
			FileInputStream input = new FileInputStream("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\hello.txt");
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
