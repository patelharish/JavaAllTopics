package AbstractionsInJava;

public class ByUsingAbstractClass {

	public static void main(String[] args) {
		Lion l = new Lion();
		Dog d = new Dog();
		l.sound();
		d.sound();

	}
}
	abstract class Animal{
		public abstract void sound();
	}
	
	class Lion extends Animal{
		public void sound() {
			System.out.println("Lion is roar...");
		}		
		
	}
	
	class Dog extends Animal{
		public void sound() {
			System.out.println("Dog is barking...");
		}
	}


