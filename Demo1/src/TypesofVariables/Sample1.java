package TypesofVariables;

public class Sample1 {

	int c=30;  //global variable- variable which is declare outside the method or the block
	           //scope of the global variable is throughout the class
	
	public void m1() {
		
		int a=10;   //local variable- variable which is declare within a block of a method
		
		System.out.println(a);  //local variable
		System.out.println(c);  //global variable
	}

    public void m2() {
	
	int b=20;     //local variable or temporary variable
	System.out.println(b);  //local variable
	System.out.println(c);  //global variable
	//we can't call variable 'a' in the method m2 as it dont have scope in m2
}
    public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.m1();
		s1.m2();
	}

}
