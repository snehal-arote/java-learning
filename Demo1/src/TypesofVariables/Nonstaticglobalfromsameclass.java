package TypesofVariables;

public class Nonstaticglobalfromsameclass {
	
     int c= 30;  //non static global variable
 
     
     
     
      public static void main(String[] args) {
    	  
    	  Nonstaticglobalfromsameclass s2 = new Nonstaticglobalfromsameclass();
    	  System.out.println(s2.c);
    	  //calling non static global variable from same class
    	  
    	  Nonstaticglobalfromdiffclass s3 = new Nonstaticglobalfromdiffclass();
    	  System.out.println(s3.d);
    	  //calling non static global variable from different class
		
	}
}
