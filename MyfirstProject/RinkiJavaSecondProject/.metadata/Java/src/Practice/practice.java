package Practice;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan 	 =  new Scanner(System.in);
		  System.out.println("Enter your Physics marks :  ");
		  int physics = scan.nextInt();
		  
		  System.out.println("Enter your English marks :  ");
		  int english =  scan.nextInt();
		  
		  System.out.println("Enter your mathes marks :  ");
		  int mathes = scan.nextInt();
		  
		  System.out.println("Enter your computer marks :  ");
          int computer = scan.nextInt();
          
		  System.out.println("Enter your hindi marks :  ");
		  int hindi = scan.nextInt();
		  
		  float percentage = ((physics + english + mathes + computer + hindi)/500.0f)*100;
		  System.out.println("percentage : ");
		  System.out.println(percentage);
		  

          


	}

}
