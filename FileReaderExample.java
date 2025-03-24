package Pro;

import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) {
		try {
	FileReader reader=new FileReader("C:\\Users\\casstudent\\eclipse-workspace\\Day6\\src\\Pro\\output.txt");
	int character;
	System.out.println("file content");
	while((character=reader.read())!=-1) {
		System.out.print((char) character);
	}
		reader.close();
		}catch(IOException e) {
			System.out.println("an error occurred: "+e.getMessage());
		}
}
}
