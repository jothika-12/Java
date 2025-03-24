package Pro;
import java.io.*;
public class BufferWriterExample {
	public static void main(String[] args) {
		try {
			BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\casstudent\\eclipse-workspace\\Day6\\src\\sample.txt"));
			writer.write("Java file handling");
			writer.newLine();
			writer.write("Buffered Writer");
			writer.close();
			System.out.println("Data has been written");
		}catch(IOException e) {
			System.out.println("Error reading file:" + e.getMessage());
		}
	}
}
