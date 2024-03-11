package mypacakge;

public class MethodemoWithReturn {

	public static void main(String[] args) {
			
		 methodzero();
		 methodone(2);
		 methodtwo(2,6);
		 methodthree(3,4,5,6,7)	;
		  System.out.println("the value of sum is :"+add(6,7));
		// or 
		  int result = add(6,7);
		  System.out.println("the value of sum is :"+ result);
	}

	
	public static void methodzero() {
		
		System.out.println("inside methodzeo");
		methodthree(3,4,5,6,7)	;
	}
	
public static void methodone(int a) {
		
		System.out.println("inside methodzeo  parameter value:"+a);
	}
public static void methodtwo(int a, int b) {
	
	System.out.println("inside methodzeo  value is :"+(a+b));
}
public static void methodthree(int a, int b,int c, int d, int e) {
	
	System.out.println("inside methodzeo"+ a+b+c+d+e);
}

 public static int add(int x, int y) {
	 
	 int sum = x+y;
	return sum;
	 
 }


}
