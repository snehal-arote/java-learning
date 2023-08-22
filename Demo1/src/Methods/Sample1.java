package Methods;

public class Sample1 {

	public static void main(String[] args)   //main method-predefined method
	{
		
		System.out.println("running main method");
		
		m1();     //calling static regular method from main method of same class
	    m2();     //syntax of method call--> methodname();
	
	}
	public static void m1()        // static regular method-user defined method
	{
		
		System.out.println("running static regular method m1");
		
	}
	
	public static void m2()
	{
		System.out.println("running static regular method m2");
	}
	
	
	
	
	
	
	
	
}
