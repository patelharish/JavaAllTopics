package LambdaExpression;
// java 8 feature
// only one method in iterfaces contains fuctional interfaces

@FunctionalInterface
interface shape{
	
	void draw(); // public + abstract 
	
}

/*class Rectangle implements shape{

	@Override
	public void draw() {
		System.out.println("Rectangle");
		
	}
	
}

class Square implements shape{
	@Override
	public void draw() {
		System.out.println("Square");
	}
}

class Circle implements shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
} */

// by using lambda expression we dont need to create multiple sub classes for implenting with parent class 
// it decreases lines of codes

public class LambdaDemo {

	public static void main(String[] args) {
		
      shape rectangle = ()-> System.out.println("Rectangle"); // lambda expression
      rectangle.draw();
      
      shape Square = ()-> System.out.println("Square"); // lambda expression
      Square.draw();
      
      shape Circle = ()-> System.out.println("Circle"); // lambda expression
      Circle.draw();
      
	}

}
