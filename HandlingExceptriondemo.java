package mypacakge;

public class HandlingExceptriondemo {

	public static void main(String[] args) {

		System.out.println("this line prints before the exception habdling");
		
		sample();		
		
	}
 public static void sample() {
	try {
		int a = 10/0; // Arithmetic exception;
		}catch (Exception e){
			
			e.printStackTrace();
			e.getMessage();
			e.getCause();
			e.getClass();
		
		}
	
 }
	
	
	
}
