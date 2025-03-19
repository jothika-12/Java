package Day3Prgms;

//single inheritance
class Animal{
	void sound() {
		System.out.println("animals make sound");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}
/*public class Inheritance {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.sound();
		d1.bark();
	}
}*/

//multilevel inheritance
class Puppy extends Dog{
	void weep() {
		System.out.println("Puppy weeps");
	}
}
/*public class Inheritance {
	public static void main(String[] args) {
		Puppy p1=new Puppy();
		p1.weep();
		p1.bark();
		p1.sound();
}
}*/

//hierarchical inheritance
class Cat extends Animal{
	void meow() {
		System.out.println("Cat meow");
	}
}
class Crow extends Animal{
	void caws() {
		System.out.println("Crow caws");
	}
}
/*public class Inheritance {
	public static void main(String[] args) {
		Cat c1=new Cat();
		Crow c2=new Crow();
		c1.meow();
		c2.caws();
	}
}*/

//multiple inheritance
interface camera{
	void capture();
}
interface MusicPlayer{
	void playMusic();
}
class Smartphone implements camera,MusicPlayer{
	public void capture() {
		System.out.println("photo captured");
	}
	public void playMusic() {
		System.out.println("Playing music");
	}
}
public class Inheritance{
	public static void main(String[] args) {
		Smartphone s1=new Smartphone();
		s1.capture();
		s1.playMusic();
	}
}