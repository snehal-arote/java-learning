package TypesofVariables;

public class Staticglobal {
	
 static int a=10;  //static global variable
 
 public static void main(String[] args) {
	
	 System.out.println(a);  //calling from main method and  same class
	 
	 
	 System.out.println(Staticglobalfromdiffclass.b);//calling static global variable from diff cls
}
 public static void m1() {
	 System.out.println(a);  //having access in static method of same class
 }
 public void m2() {
	 System.out.println(a);  //having access in non-static method and same class
  }
 
}
