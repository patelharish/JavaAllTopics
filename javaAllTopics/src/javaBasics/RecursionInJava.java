package javaBasics;

public class RecursionInJava {

	public static void main(String[] args) {		
		RecursionInJava ref = new RecursionInJava();
		int a = ref.sum(10);
		System.out.println(a);
		
	}
		int sum(int b) {
			if(b>0) {
				return b+sum(b-1);
			}
			else {
				return 0;
			}
		

	}

}
