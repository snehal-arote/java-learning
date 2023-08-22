package AccessSpecifier;

public class PrivateAccessSpecifier {
	private int a;   //GLOBAL VARIABLE
	
	PrivateAccessSpecifier(){ 
		
		//private access specifier has scope in only in one class of the package
		
		a=10;
	}
	
	private void addition() {
		System.out.println(a+a);
	}
    
	public static void main(String[] args) {
		PrivateAccessSpecifier s3=new PrivateAccessSpecifier();
		s3.addition();
		
	}
}
