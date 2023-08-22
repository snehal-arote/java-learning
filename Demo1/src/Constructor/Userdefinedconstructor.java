package Constructor;

public class Userdefinedconstructor { //zero parameter user defined constructor
	
	int num1;  //User defined constructor is used to perform the operations on global variable
	int num2;
	
	Userdefinedconstructor()
	{
		num1=10;
		num2=20;
	}
	
	public void add() {
		System.out.println(num1+num2);
	}
	public void mult() {
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		Userdefinedconstructor s1=new Userdefinedconstructor();
		s1.add();
		s1.mult();
		
	}
	

}
