package InheritaceConcept;

public class Cat {


	public static void main (String [] args) {
		System.out.println("main-1");
				Cat obj=new Cat();

	}

	public Cat() {
		this(10);
		System.out.println("1-first constructor");
	}
	
	public Cat(int x) {

		System.out.println(x);
	}


	public void Cat1(int x) {
		this(10);
		System.out.println(x);
	}
}
