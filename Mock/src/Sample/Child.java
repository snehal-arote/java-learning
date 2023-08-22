package Sample;

public class Child extends Father {

	public void Child1() {
		System.out.println("Mobile: samsung");

	}

	
	public static void main(String[] args) {
		Child c1=new Child();
		c1.Father1();
		c1.Child1();
		
	}
}
