
public class JavaSwappingValues {
	public String x;
	public String y;
	public static String m;
	
	public static void main(String[] args) {
		
		JavaSwappingValues objClas1 = new JavaSwappingValues();
		
		objClas1.x="Hiiiiiii";
		objClas1.m="sandeep";
		System.out.println(objClas1.x);
		System.out.println(objClas1.m+" ::objClas1");
		
		JavaSwappingValues objClas2 = new JavaSwappingValues();		
		System.out.println(objClas2.x);
		System.out.println(objClas2.m+" ::objClas2");
		
	}


	public static void add1() {
		String x;
//		x="";
		System.out.println(x);

	}

	public void add2() {
		x="Hello";
		System.out.println(x);
	}
}
