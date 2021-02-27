package abc;

public class Practicework {
	public static headerInterFace obj;

	public static void main(String [] args) {

		String x="pdf";

		if(x.equalsIgnoreCase("word")) {
			obj=new word();

		}else if (x.equalsIgnoreCase("xls")) {
			obj =new Excel();

		}else if (x.equalsIgnoreCase("PDF")) {
			obj =new PDF();
		}

		obj.read();
		obj.write();
		obj.append();

	}

}
