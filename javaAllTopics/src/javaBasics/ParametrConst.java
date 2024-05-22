package javaBasics;

class A{
	int x;
	int y;

	A(int a, int c){  // parameterize constructor
		x = a;
		y = c;
	}

	void Show() {
		System.out.println(x + " " + y);
	}
}

class ParametrConst {
	public static void main(String[] args) {
		A ref = new A(100,200);
		ref.Show();

	}
}
