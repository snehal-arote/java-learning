package Methods;

public class Sample4 
{
     
	public static void main(String[] args) {
		
		Sample4 S4=new Sample4();     //1.Create object/copy of current class
		//className objectname=new className();
		
		S4.m4();                      //2.syntax-->  diffobjectname.methodname();
	
	}

	public void m4()   //non static regular method
	{
		
		System.out.println("running non static regular method m4 from same class");
	}
}
