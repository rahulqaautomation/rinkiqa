

public class StringPrograms {

	public static void main (String args[]) {
		StringPrograms obj1=new StringPrograms();
		obj1.StringPrograms16();
	}


	public void  StringPrograms1() {
		// use of Char method to findout charector all.
		String x="Hello India and world";
		int cnt=x.length();
		for(int i=0; i<cnt; i++) {
			char c=x.charAt(i);
			System.out.println(c);	
		}

	}


	public void StringPrograms2() {
		// Use of Compare to- it compares all char on basis of Unicode, if come 0 then Pass otherwise Fail
		String x="Hello india and world";
		String x1="Hello India and world";
		int c=x.compareTo(x1);
		System.out.println(c);

	}

	public void StringPrograms3() {
		String x="Hello India and world";
		String x1="Hello kndia and world";
		int c=x.compareToIgnoreCase(x1);
		System.out.println(c);
	}

	public void StringPrograms4() {
		String x="Hello India and world";
		x=x.concat(" Need Info");
		System.out.println(x);
	}

	public void StringPrograms5() {
		String x="Hello India and world";
		boolean b=x.contains("orl");
		System.out.println(b);
	}

	public void StringPrograms6() {
		String x="Hello India and world";
		boolean b=x.contentEquals("Hello India and world");
		System.out.println(b);
	}

	public void StringPrograms7() {
		String x="Hello India and world";
		boolean b=x.endsWith("world");
		System.out.println(b);
	}

	public void StringPrograms8() {
		String x="Hello India and world";
		boolean b=x.startsWith("He");
		System.out.println(b);
	}


	public void StringPrograms9() {
		String x="Hello India and world";
		boolean b=x.equals("hello India and world");
		System.out.println(b);

	}

	public void StringPrograms10() {
		String x="Hello India and world";
		boolean b=x.equalsIgnoreCase("hello India and world");
		System.out.println(b);

	}

	public void StringPrograms11() {
		String x="Hello India and world";
		int c=x.indexOf("a");
		System.out.println(c);
	}

	public void StringPrograms12() {
		String x="HelElo indeia and world";
		int pos=x.indexOf("i",1);
		System.out.println(pos);

		pos=x.indexOf("i",pos+1);
		System.out.println(pos);

		pos=x.indexOf("i",pos+1);
		System.out.println(pos);
	}
	/// searching  string pos using IndexOf Method
	public void StringPrograms13() {
		String x="HelElo indeia and world";
		int pos=0;
		for (int i=0;i<x.length();i++) {
			pos=x.indexOf("i",pos+1);
			if(pos==-1) {
				break;
			}
			System.out.println(pos);

		}

	}

	/// searching  string pos without using IndexOf Method
	public void StringPrograms14() {
		String x="HelElo indeia and world";
		int pos=0;
		for (int j=0;j<x.length();j++) {
			char c=x.charAt(j);

			String c1=String.valueOf(c);
			if(c1.compareToIgnoreCase("i")==0) {
				System.out.println(j);
			}
		}
	}
	/// use of Replace
	public void StringPrograms15() {
		String x="HelElo indeia and world";
		String s=x.replaceAll("e", "**");
		System.out.println(s.toUpperCase());

	}

	// each word of first letter should be in caps
	public void StringPrograms16() {
		String x="HelElo indeia and world";
		String [] arrstr=x.split(" ");
		for(String sbstr : arrstr){
			String firstChar=sbstr.substring(0, 1);
			sbstr=sbstr.replaceFirst(firstChar,firstChar.toUpperCase());
			System.out.println(sbstr);
		}
	}		


}
