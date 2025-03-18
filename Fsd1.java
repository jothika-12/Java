package Day1Prgms;
import java.util.*;
public class Fsd1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter name:");
		String name=s1.nextLine();
		System.out.println("my name is "+ name);
		System.out.println("enter mark:");
		int mark=s1.nextInt();
		System.out.println("my mark is "+mark);
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
