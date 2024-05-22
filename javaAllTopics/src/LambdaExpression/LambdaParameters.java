package LambdaExpression;


interface Addable{
	int addition(int a, int b);
	
}

/*class AddNumm implements Addable{
	
		@Override
	public int addition(int a, int b) {
		
		return (a+b);
	}
}*/

public class LambdaParameters {

	public static void main(String[] args) {
		
		Addable addition1 = (a,b) -> (a+b);
		int result = addition1.addition(10, 20);
		
		System.out.println(result);
	}

}
