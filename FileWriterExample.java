package Pro;
import java.io.*;
public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileWriter w1=new  FileWriter("C:\\Users\\casstudent\\eclipse-workspace\\Day6\\src\\Pro\\output.txt");
			w1.write("hello,kgcas");
			w1.close();
			System.out.println("Data is written");
		}catch(IOException e) {
			System.out.println("an error occurred: "+e.getMessage());
		}
	}
}
