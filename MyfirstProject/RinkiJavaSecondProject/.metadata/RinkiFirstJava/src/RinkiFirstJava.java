
public class RinkiFirstJava {

	public static void main(String[] args) {

		int x=add1(10,20);
		System.out.println(x);
		
		x=add2(x,5);
		System.out.println("Multiplication with add1 value::- "+x);
		
		x=add1(20,30);
		System.out.println(x);
		
		x=add2(x,5);
		System.out.println("Multiplication with add1 value::- "+x);
		}
		
        public static int add1(int a,int b) {       
        	int c=a+b;
        	c=c*2;
        	return c;
        }
        
        public static int add2(int a,int b) {       
        	int c=a/b;
        	c=c*2;
        	return c;
        }
        
	}
		
		
