package singleInheritance;

 class PClass {
	 long mobile = 9874563210l;
	 
}
 
 public class CClass extends PClass{
	 public static void main(String[] args) {
		System.out.println("Parent Mobile : "+new CClass().mobile);
	}
 }
