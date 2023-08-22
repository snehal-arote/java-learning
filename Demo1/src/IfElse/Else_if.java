package IfElse;

public class Else_if {

	public static void main(String[] args) {
    //to compare the multiple conditions we can use Elseif
		
		int marks=37;
		
		if(marks>=90)
		{
			System.out.println("Distinction");
		}
		else if(marks>=70 & marks<90)
		{
			System.out.println("FirstClass");
		}
		else if(marks>=36 & marks<70)
		{
			System.out.println("SecondClass");
		}
		else if(marks<36)
		{
			System.out.println("Fail");
		}

	}

}
