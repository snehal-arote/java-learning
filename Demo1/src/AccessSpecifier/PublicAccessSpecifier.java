package AccessSpecifier;

public class PublicAccessSpecifier {
	public int e;
	
	PublicAccessSpecifier(){
		e=15;
		}
	
	public void square() {
		System.out.println(e*e);
	}
	
	public static void main(String[] args) {
		PublicAccessSpecifier q1=new PublicAccessSpecifier();
				q1.square();
	}
}

