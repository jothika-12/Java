package Day3Prgms;

//default constructor
/*class Car{
	String brand;
	Car(){
		brand="Unknown";
	}
	void display() {
		System.out.println("the brand name is :"+brand);
	}
}
public class Constructor {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.display();
	}
}

//parameterized constructor
class Bike{
	int count;
	Bike(int count){
		this.count=count;
	}
	void display() {
		System.out.println("bike count: "+count);
	}
}
public class Constructor{
	public static void main(String[] args) {
		Bike b1=new Bike(2);
		b1.display();
	}
}*/

//example program
class Book{
	int bookId;
	String title;
	Double price;
	Book(int bookId,String title,Double price){
		this.bookId=bookId;
		this.title=title;
		this.price=price;
	}
	void display() {
		System.out.println("Book ID: "+bookId);
		System.out.println("Title of the book: "+title);
		System.out.println("Price of the book: "+price);
	}
}
public class Constructor{
	public static void main(String[] args) {
		Book b1=new Book(01,"C++",130.20);
		Book b2=new Book(02,"C",100.20);
		Book b3=new Book(03,"Java",200.20);
		b1.display();
		b2.display();
		b3.display();
	}
}
