package StringScenario;

public class ScenarioPractice {

	public static void main(String[] args) {
		
//		sce1();
//		sce2();
		sce3();
	}
	
	public static void sce1() {
		String x="Hello India and world";
		int cnt=x.length();
		System.out.println(cnt);
		
		
		for (int i=0;i<cnt;i++) {
			String st=x.substring(i, i+1);	
			System.out.println(st);
		}
		
	}
	
	public static void sce2() {///  while loop
		String x="Hello India and world";
		int cnt=x.length();
		int i=0;
		while(i<=cnt) {
			i=i+1;
			System.out.println(i);
			
		}
		
	}
	
	
	public static void sce3() {///  while loop
		String x="Hello India and world";
		int cnt=x.length();
		String vw="";
		for (int i=0;i<cnt;i++) {
			String st=x.substring(i, i+1);	
			if(st.contains("a")|| st.contains("e")|| st.contains("i")|| st.contains("o")|| st.contains("u")) {
				
				vw=vw+st;
			}

		}
		System.out.println(vw);
	}

}
