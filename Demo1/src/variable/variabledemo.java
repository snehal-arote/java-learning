package variable;

public class variabledemo {

	public static void main(String[] args) {
		
		//variable declaration
		
		//string --> multiple characters eg.Snehal, abc@123, A+, B+
		//int --> numeric + non decimal information eg.1,4,145
		//float --> numeric + decimal information eg. 58.3, 45000.9
		//char --> single charachter eg. A, B, C
		
		//syntax--> datatype variableName; 
		
		String name;  //memory size of Non primitive data type  is not fixed
		
		String Department;  //S is Capital as it is identifier
		
		int RollNum;   //memory size fixed for primitive data types
		
		char grade;   //primitive data type 2byte
		
		float per;    //primitive data type 4byte
		
		//variable initialization
		
		//syntax--> variableName="variable Value";
		
		name="Snehal";
		Department="Mechanical";
		RollNum=10;
		grade='A';
		per=89.9f;
		
		//variable usage
		
		System.out.println("Student Name:"+name);
		System.out.println("Student dept:"+Department);
		System.out.println("Student RollNum:"+RollNum);
		System.out.println("Student Grade:"+grade);
		System.out.println("Student Percentage:"+per);
	}
		

}
		
		
		
		
		
		

	


