package Day3Prgms;
import java.util.*;

//class and object
/*class Order{
	String dish;
	int Quantity;
	int price;
	void get() {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter dish ordered: ");
		dish =s1.nextLine();
		System.out.println("enter no.of quantity ordered: ");
		Quantity =s1.nextInt();
		System.out.println("enter total price: ");
		price =s1.nextInt();
	}
	void total() {
		System.out.println("ordered dish:" + dish);
		System.out.println("No.of quantity:" + Quantity);
		System.out.println("Total Price:" + price);
	}
}
public class ClassandObjects {
	public static void main(String[] args) {
		Order order1=new Order();
		order1.get();
		order1.total();
	}
}*/

//method
public class ClassandObjects {
	public static int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(sum(10,20));
	}
}
