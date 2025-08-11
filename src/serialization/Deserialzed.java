package serialization;
import java.io.*;
public class Deserialzed {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream in  = new ObjectInputStream( new FileInputStream("C:\\Users\\Lenovo\\Desktop\\hello1.txt"));
        
		Student s = (Student)in.readObject();
		
		System.out.println(s.roll + " " + s.name);
		in.close();
	}

}
