package mypacakge;

public class SingleDimArrrayDemo {

	public static void main(String[] args) {
		
	/*	int [] a = new int [3]; //declaration & creation of array
		// Assiging the values t o array
		a[0]=3;
		a[1]=5;
		a[2]=6;  */
		
		// Short cut of declaring create & assigning in a single line
		
		int []a = {19,16,31,5,6,7,8,9};
		
		
		System.out.println("The value is index :"+ a[0]);
		System.out.println("The value is index :"+ a[1]);
		System.out.println("The value is index :"+ a[2]);
	
		System.out.println( "the sixe of the array is :"+ a.length);
	
		// in order to print all the values of arrary i will have to write 8 line of code.
	
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	}

}
