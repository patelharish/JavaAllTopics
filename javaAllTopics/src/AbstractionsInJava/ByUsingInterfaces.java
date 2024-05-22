package AbstractionsInJava;

public class ByUsingInterfaces {

	public static void main(String[] args) {
		customerHari s = new Sanjuseller();
		s.buy();

	}

}

interface customerHari{
	int amt = 100; // public + static + final
	void buy();// public + Abstract
}

class Sanjuseller implements customerHari{
	@Override
	public void buy() 
	{		
		System.out.println("Sanjuseller needs "+amt+"kg rice");
		System.out.println(amt);
	}
}
