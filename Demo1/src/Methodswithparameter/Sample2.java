package Methodswithparameter;

public class Sample2 {

	public static void main(String[] args) {
		
    Sample2 s2=new Sample2();
    s2.sub(12,9);
    s2.sub(17,10);  //method with int parameter and non static method

    add(12,12);    //method with int parameter and static method

   studentFNLN("Snehal","Arote");  //method with string parameter and static method

	}

	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void add(int c,int d)
	{
		System.out.println(c+d);
	}
public static void studentFNLN(String FN,String LN)
{
	System.out.println(FN+ " " +LN);
}
}
