package IfElse;

public class Elseif_sample1 {

	public static void main(String[] args) {
		int marks=65;
		if(marks>=90) {
			System.out.println("Distinction");
		}
		else if(marks<90 & marks>=80 ) {
			System.out.println("First class");
		}
		else if(marks<80 & marks>=70)
		{
			System.out.println("second class");
		}
		else if(marks>=36) {
			System.out.println("Fail");
		}
	}

}
