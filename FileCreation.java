package Pro;
import java.io.*;
public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f1 =new File("demo.txt");
		f1.createNewFile();
		System.out.println("file created");
	}

}
