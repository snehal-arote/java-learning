package AccessSpecifier;

public class DefaultAccessSpecifier {
	
	int b; //global variable
	
	DefaultAccessSpecifier(){
		b=20;
	}
	void Squreofnumber(){   
		
//default access specifier has scope within package( i.e.also in diff class of the same packages)
		
		System.out.println(b*b);
	}
	
	public static void main(String[] args) {
		
		DefaultAccessSpecifier s1=new DefaultAccessSpecifier();
		s1.Squreofnumber();
		
		
	}

}
