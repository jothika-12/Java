package Day2Prgms;

import java.util.Scanner;
public class Strings {
	public static void main(String[] args) {
		String str="Java Programming";
		String str1="Python Programming";
		//Strings
		/*String name= new String("jo");
		System.out.println(name);

		//userinput
		Scanner s1=new Scanner(System.in);
		System.out.println("enter name");
		String name=s1.nextLine();
		System.out.println(name);
		
		//length
		System.out.println(str.length());
		
		//substring
		System.out.println(str.substring(3));
		System.out.println(str.substring(0,4));
		
		//IndexOf
		System.out.println(str.indexOf("mming"));
		System.out.println(str.indexOf("x"));
		
		//uppercase and lowercase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//replace
		System.out.println(str.replace('a','A'));
		
		//equals
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//charA
		System.out.println(str.charAt(2));
		
		//split
		String s="java,python,springboot";
		String[] lang=s.split(",");
		for(String s1:lang) {
			System.out.println(s1);
		}
		
		//concat
		System.out.println("concat string:" +str.concat(str1));
		
		//trim
		System.out.println(str.length());
		String str2 = str.trim();
		System.out.println(str2);
		System.out.println(str2.length());
		
		//compareTo
		System.out.println(str.compareTo(str1));
		
		//contains
		System.out.println(str.contains("Java"));
		System.out.println(str.contains("Python"));
		
		//string intern
		String s2=str.intern();
		System.out.println(str==str1);
		System.out.println(str1==s2);
		
		//string builder
		StringBuilder sb =new StringBuilder("hello");
		sb.append(" world");
		System.out.println("After append:" + sb);
		sb.insert(5, ",");
		System.out.println("After insert:" + sb );
		sb.replace(0, 5, "hi");
		System.out.println("After replace:" +sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);*/
		
		//StringBuffer
		StringBuffer sb =new StringBuffer("hello");
		sb.append(" world");
		System.out.println("After append:" + sb);
		sb.insert(5, ",");
		System.out.println("After insert:" + sb );
		sb.replace(0, 5, "hi");
		System.out.println("After replace:" +sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);
	}
}