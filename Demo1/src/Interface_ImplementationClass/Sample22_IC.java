package Interface_ImplementationClass;

public class Sample22_IC implements Sample11,Sample12 {  
	
	//multiple inheritance using interface
	
	public void m1() {
		System.out.println(a);
		System.out.println("running m1 from sample11");
	}
    
	public void m2() {
		System.out.println("running m2 from Sample11");
	}
	
	public void m3() {
		System.out.println(b);
		System.out.println("running m3 from Sample12");
	}
	
	public void m4() {
		System.out.println("running m4 from Sample12");
	}
}
