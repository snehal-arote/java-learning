package IfElse;

public class Nested_if {

	public static void main(String[] args) {
		int PEM=3000;
		int Mains=750;
		
		if(PEM>=300)     //Nested_if is used when we are having subparameters in comparison 
		{
			System.out.println("Eligible for mains");
			
			if(Mains>=800)
			{
				System.out.println("Eligible for Interview");
			}
			else
			{
			System.out.println("Rejected in Mains");	
			}
		}
		else
		{
			System.out.println("Not eligible for mains");
		}
	}

}
