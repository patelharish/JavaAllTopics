package Polymorphism;

// Run time polymorphism or method overriding or dynamic
public class RunTimePoly {

	public static void main(String[] args) {
		square r = new square();
		r.draw();

	}

}

class shape{
	void draw()
	{
		System.out.println("can't find shape");
	}
}

class square extends shape  // it is compulsary to use inheritance in method overriding
{ 
	@Override   // this is a override annotation that is use to specify the current method is overridden
	void draw() 
	{ 
		super.draw();       // by using super keyword we can access super class method
		System.out.println("square");
	}
}
