
public class StringPractice {

	public static void main(String[] args) {
		String x="Hello India and world";
		int cnt=x.length();
		for (int i=cnt;i>=1;i--) {
			String v=x.substring(i-1, i);
			System.out.println(v);
			
		}

	}


	public void fn_str1() {

		String x="hello india and world";
		String [] arr=x.split(" ");
		System.out.println(arr[0]);
	}

	public void fn_2() {/// use of reverse through String builder
		StringBuffer x=new StringBuffer("Hello India and world");
		x=x.reverse();
		System.out.println(x);
	}
}
