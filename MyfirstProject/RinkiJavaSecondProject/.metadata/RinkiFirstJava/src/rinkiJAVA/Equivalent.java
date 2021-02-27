package rinkiJAVA;

public class Equivalent {

	public static void main(String args[]) {
		String x="2/9";
		String y="12/54";
		boolean f=verifyequivlentvalue(x,y);
		System.out.println("Equivalent-"+f+"::"+x+","+y);

		x="3/8";
		y="27/72";
		f=verifyequivlentvalue(x,y);
		System.out.println("Equivalent-"+f+"::"+x+","+y);

		x="3/7";
		y="12/30";
		f=verifyequivlentvalue(x,y);
		System.out.println("Equivalent-"+f+"::"+x+","+y);

		x="4/5";
		y="8/26";
		f=verifyequivlentvalue(x, y);
		System.out.println("Equivalent-"+f+"::"+x+","+y);


	}


	public static boolean verifyequivlentvalue(String a, String b)	{
		boolean flag=false;
		String[] ar1=a.split("/");
		String[] ar2=b.split("/");

		int m=Integer.parseInt(ar1[0]);
		int n=Integer.parseInt(ar1[1]);
		int o=Integer.parseInt(ar2[0]);
		int p=Integer.parseInt(ar2[1]);

		int x=m*p;
		int y=n*o;
		if(x==y){
			flag=true;
		} else {
			flag=false;
		}
		return flag;

	}

}



