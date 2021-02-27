package InheritaceConcept;
 
	 class Base{
		 int x;
		 public int getx() {
			 return x;
		 }
		 public void setx(int x) {
		 System.out.println("I am in base and setting x now");
			 this.x = x;
		 }
		 public void printMe(){
		 System.out.println("I am constructor");
		 }
	 }
	 
	class Derived extends Base {
		int y;
		public int gety() {
			return y;
		}
		public void  sety(int y) {
			this.y = y;
		}
	}
			
	 public class BasedtoDerived {
	 public static void main(String[] args) {
		 // Creating an object of base class
	    Base b =  new Base();
		b.setx(4);
        System.out.println(b.getx());
        
        // Creating an object of derived class
        Derived d =  new Derived();
		d.sety(67);
        System.out.println(d.gety());

	
	}
 }
		
		
		
		
		
	


