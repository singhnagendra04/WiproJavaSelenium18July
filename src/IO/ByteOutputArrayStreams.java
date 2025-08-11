package IO;
import java.io.*;

public class ByteOutputArrayStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Hello dosto kaise ho aap";
		
		try {
			ByteArrayOutputStream out =  new ByteArrayOutputStream();
			byte[] arr = data.getBytes();
			
			out.write(arr);
			
			String streamdata = out.toString();
			System.out.println("Output Stream : " + streamdata);
			out.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
