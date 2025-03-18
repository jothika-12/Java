package Day2Prgms;

public class WrapperClass {
	public static void main(String[] args) {
		
		//creating wrapper class
		Integer myInt=Integer.valueOf(100);
		Double myDouble=Double.valueOf(12.34);
		Character myChar=Character.valueOf('A');
		Boolean myBool=Boolean.valueOf(true);
		
		//Autoboxing
		Integer intObj=50;
		Double doubleObj=12.34;
		Character charObj='A';
		Boolean boolObj=true;
		
		//Unboxing
		int intVal=intObj;
		double doubleVal = doubleObj;
		char charVal=charObj;
		boolean boolVal=boolObj;
		System.out.println(intVal);
		System.out.println(doubleVal);
		System.out.println(charVal);
		System.out.println(boolVal);
	}
}
