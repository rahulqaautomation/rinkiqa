package InheritaceConcept;
  
     class Base1{ 
     Base1(){
    	 System.out.println("I am constructor");
         }
     
         Base1(int x){
    	 System.out.println("I am an overloaded constructor with x vlae of x as: " + x);
     }
       
     }
     
     class Derived1 extends Base1{
    	 Derived1(){
    		//super(a: 0);
    		 System.out.println("I am a derived class constructor");
    	 }
    	 Derived1(int x, int y){
    		 super(x);
    		 System.out.println("I am an overloaded constructor with y vlae of y as: "  + y);
    	 }
     }
      

public class java {

	public static void main(String[] args) {

	//	Base1 b = new Base1();
		Derived1 d = new Derived1(45, 56);
	}

}
