package AccessSpecifier1;
import AccessSpecifier.ProtectedAccessSpecifier;

public class ProtectedAccessSpecifier2 extends ProtectedAccessSpecifier
       {
	
    public static void main(String[] args) {
	ProtectedAccessSpecifier2 obj=new ProtectedAccessSpecifier2();
	obj.square();
	
	System.out.println(obj.c);
}
}
