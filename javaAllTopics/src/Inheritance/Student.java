package Inheritance;

// Multilevel inheritance
class Collage {   // super class
	void run() {
		System.out.println("hari");
	}
}

class room extends Collage { //sub class1
	void disp() {
		System.out.println("room no");
	}
}
class cafe extends room{  // sub class2
     void caff() {
    	 System.out.println("cafe");
     }
}

class Student extends cafe {  // sub class3
	public static void main(String[] args) {
		cafe r = new cafe();
		r.run();
		r.disp();
		r.caff();
	}
}
