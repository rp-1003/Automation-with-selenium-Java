package mypacakge;

public class Methoddemo {

	public static void main(String[] args) {
		
		methodone();
		methodone();
		 methodtwo(2);
	}

	public static void methodone() {
		 System.out.println("Inside methodone");
		 methodtwo(2);
	}
	
	public static int methodtwo(int a) {
		
		return 20 ;
		 
	}
	
}
