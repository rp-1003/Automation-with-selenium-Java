package mypacakge;

public class ObjectsConceptsdemo {
 
	// All variable outside methods alre also called a global varaible or instance variables
	
	static int a =5; // staic varibale
int b =9; // instance variable
int c =11;  // instance variable

	
	// static variabe  can only be accessed by the static method.
	
	public static void main(String[] args) {
		
		int x=3, y=7;  // local variable;
		 int sum = x+y+a;
		
		System.out.println(sum);
		sample();
	}
/// remmeber staic methods can only access static stuff
	
	
	// non static methods
	
	public  static void sample() {
		
		System.out.println("Inside sample method");
	}
	
	
}
