package UseofStaticNonstatic;

public class EmpDetails {

	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.empname="Snehal";
		e1.empID=190;
		
		Emp.CEO="Sushil";
		
		Emp e2=new Emp();
		e2.empname="ABC";
		e2.empID=191;
		
		Emp.CEO="Sushil";
		
		Emp e3=new Emp();
		e3.empname="XYZ";
		e3.empID=192;
		Emp.CEO="Sushil";
		
		e1.Studentinfo();
		e2.Studentinfo();
		e3.Studentinfo();
	}
}
