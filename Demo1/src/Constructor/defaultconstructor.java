package Constructor;

public class defaultconstructor {
	
	//1. EXAMPLE OF DEFAULT CONSTRUCTOR 
	
	//Default constructor: constructor which is provided by the compiler at the compilation time

	
		//defaultconstructor{
	
			//it is present by default in the class
	
		//}
	
	
	public void m1() {
		System.out.println("running m1 from same class");
	}
	public void m2() {
		System.out.println("running m2 from same class");
	}
	
	public static void main(String[] args) {
		defaultconstructor s1=new defaultconstructor();
		s1.m1();
		s1.m2();
		System.out.println("-------------");
		
		Defaultconstructorfromdifferentclass s2=new Defaultconstructorfromdifferentclass();
		s2.m3();
		
	}
	
	
	
}
