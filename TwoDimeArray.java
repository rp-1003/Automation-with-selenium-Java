package mypacakge;

public class TwoDimeArray {

	public static void main(String[] args) {

		
		// in single dimensions we have onely one index
		// in two dimensional array we have 2 indexes.
		
	// int [][] a= new int[row][col]sysntax for 2 dimensional array.
		
/*		int [][] a = new int [3][3];
		
		a[0][0] =9;
		a[0][1]=7;
		a[0][2]=6;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a.length);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
	*/
	
	
	int[][] a = {{3,2,1},{1,2,3}};
	
	 for(int row=0;row<a.length;row++) {
	
		 for(int col=0;col<a[0].length;col++) {
	
			 System.out.println(a[row][col]);
		 }
	
	
	 }
	
	
	
	}

}

		