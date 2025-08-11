package serialization;

import java.io.*;
public class Serialized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	
        	Student s1 = new Student(211,"Aman");
        	
        	FileOutputStream fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\hello1.txt");
        	
        	ObjectOutputStream out = new ObjectOutputStream(fout);
        	
        	out.writeObject(s1);
        	
        	out.flush();
        	
        	fout.close();
        	
        	out.close();
        	
        	System.out.println("Object is serialized");
        	
        } catch(Exception e) {
        	System.out.println(e);
        }
	}

}
