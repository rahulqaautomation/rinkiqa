package StringScenario;

public class ArrayConcept {
	boolean flag;
	public static void main(String[] args) {
		ArrayConcept classObj=new ArrayConcept();

		classObj.verifyArrayValue();

//		String [] c=new String[] {"sdsdd","fgfgfgf", "eeerrr"};
//		
//		int [] v=new int[] {22,33};
	}

	public void verifyArrayValue() {

		int varCount1 []= {10,20, 30,40, 50, 60, 70,80,90,56};
		int cnt = varCount1.length;
		for (int i=0; i<cnt;i++) {
			int c=varCount1[i];
			if (c==60) {
				flag=true;
				break;
			}
			System.out.println(i);
		}
			System.out.println(flag);
		}

	}
