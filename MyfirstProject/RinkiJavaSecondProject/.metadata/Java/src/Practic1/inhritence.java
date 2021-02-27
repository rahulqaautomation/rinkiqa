package Practic1;

 class AA {
	void showA()
	{
		System.out.println("a class method");
	}
	
}

class Bgg extends AA 
{
	void showB()
	{
		System.out.println("b class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			AA ob1 = new AA ();
			ob1.showA();
			Bgg ob2 = new Bgg ();
			ob2.showA();
			ob2.showB();
		}
	}

}
