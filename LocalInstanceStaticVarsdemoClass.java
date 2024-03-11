package mypacakge;

public class LocalInstanceStaticVarsdemoClass {
	
	static // instance varaible are defined at class level
	int x=4;
	static int y=9;	

	public static void main(String[] args) {
	// local variable are only avaliabe with in the mothods
		int a = 10 , b=6;
		
		System.out.println(a+b);
		method1() ;

	}

	public static void method1() {
		
	//	System.out.println(a+b);// we can see that i cannot access the variable a & b defined in other methods.
		
	System.out.println(x);
	System.out.println(y);
	
	}
	
	
	
}
