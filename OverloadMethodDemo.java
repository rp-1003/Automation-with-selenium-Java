package mypacakge;

public class OverloadMethodDemo {

	public static void main(String[] args) {
		System.out.println(" this programm demonstrates the overloading of method oncepts ");
	     
		method1(5);
	}

	
		public static void method1() {
			
			System.out.println("this is the method1, no parameters");
		}
		
		public static void method1(int a) {
			
			System.out.println("this is the method overloading "+ a);
		}
		public void method1(int a , int b) {
	
			System.out.println("this is the method overloading ");
}

		public void method1(int b, char c) {
	
			System.out.println("this is the method loading ");
}

public void method1(char c, int b) {
			
			System.out.println("this is the method loading ");
		}
		
	
	
	
	
	
	
}
