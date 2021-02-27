package HasARelationship;

public class Circle {

	Operation op;
	double pi=3.14;
	public double area(int radius) {
		op=new Operation();
		int rsquare=op.Square(radius);
		return pi*rsquare;
	}

	public static void main(String [] args) {
		Circle ci=new Circle();
		double d=ci.area(5);
		System.out.println(d);
	}
}
