package Pro;
import java.io.*;
public class BufferReaderExample {
	public static void main(String[] args) {
		try {
			BufferedReader r1=new BufferedReader(new FileReader("C:\\Users\\casstudent\\eclipse-workspace\\Day6\\src\\sample.txt"));
			String line;
			System.out.println("Reading file line by line");
			while ((line=r1.readLine())!= null) {
				System.out.println(line);
			}
			r1.close();
		}catch(IOException e) {
			System.out.println("Error reading file:" + e.getMessage());
		}
	}
}
