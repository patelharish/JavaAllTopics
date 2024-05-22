package Inheritance;

//single inheritance

class student // parent class
{
	int roll, marks;
	String name;

	void Input() {
		System.out.println("Enter your role & m arks: ");
	}
}

class ankit extends student // child class
{
	void disp() {
		roll = 1;
		marks = 89;
		name = "rahul";
		System.out.println(roll + " " + name + " " + marks);
	}

public static void main(String[] args) {
		ankit A = new ankit();
		A.Input();
		A.disp();
	}
}