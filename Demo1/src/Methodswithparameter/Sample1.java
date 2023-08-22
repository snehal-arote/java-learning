package Methodswithparameter;

public class Sample1 {

	public static void main(String[] args) {
		
		add(16,18);
		add(7,8);
		
		Sample1 s1=new Sample1();
		s1.mult(2,5);
		s1.mult(18,4);
		
	}
		
		public static void add(int a,int b)
		{
			System.out.println(a+b);
		}

		public void mult(int c,int d)
		{
			System.out.println(c*d);
		}
		
	}


