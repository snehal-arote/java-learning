package AccessSpecifier;

public class ProtectedAccessSpecifier {
	protected int c;
	
	ProtectedAccessSpecifier(){
		
		c=30;
		
	}
	protected void square() {
		
		System.out.println(c*c);
	}
	public static void main(String[] args) {
		
		ProtectedAccessSpecifier s5=new ProtectedAccessSpecifier();
		s5.square();
		
	}
	
	

}
