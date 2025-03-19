package Day3Prgms;
class Student{
	public String name="jo";
	private int age=20;
	protected String grade="A";
	String school="ABC school";
	public void display() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("grade: "+grade);
		System.out.println("school: "+school);
	}
}
public class AccessSpecifier {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
		System.out.println("public name:"+s1.name);
		System.out.println("default school:"+s1.school);
	}
}
