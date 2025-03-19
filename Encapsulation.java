package Day3Prgms;
class Data1{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name=name;
		}else {
			System.out.println("invalid");
		}
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Data1 s1=new Data1();
		s1.setName("jo");
		System.out.println("Student name: "+ s1.getName());
	}
}
