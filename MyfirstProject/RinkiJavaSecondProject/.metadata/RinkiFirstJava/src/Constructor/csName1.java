package Constructor;

public class csName1 {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;	
//		csName1 obj1=new csName1(x,y);
//		obj1=new csName1(x,"Sandeep");
//		obj1=new csName1(x,y,20);
		csName1 obj1=new csName1();
		
	}

	   	public csName1 () {
			this(10,20);
			System.out.println("csname1");
			
		}

	public csName1 (int a, int b) {
		int c=a+b;
		c=c*2;
		System.out.println(c);
	}

	public csName1 (int a, int b, int c1) {
		int c=a+b+c1;
		c=c*2;
		System.out.println(c);
	}
	
	public csName1 (int a, String b) {
		
		System.out.println(a+b);
	}	
	
}
