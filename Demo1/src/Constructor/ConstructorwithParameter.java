package Constructor;

public class ConstructorwithParameter {

	int num1;
	int num2;
	
	ConstructorwithParameter(int a,int b){
		num1=a;
		num2=b;
	}
	
	public void add() {
		System.out.println(num1+num2);
	
	}
	
	public void mult() {
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		ConstructorwithParameter s1=new ConstructorwithParameter(40,50); 
		//here we need to pass value to the constructor
	//so we can do same operations on different values by creating new objects in the same class
		
		s1.add();
		s1.mult();
		
		System.out.println("-----------");
		
		ConstructorwithParameter s2=new ConstructorwithParameter(32,87);
		s2.add();
		s2.mult();
		
		
	}
}
