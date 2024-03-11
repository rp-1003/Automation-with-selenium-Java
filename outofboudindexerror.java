package mypacakge;

public class outofboudindexerror {

	public static void main(String[] args) {

		
		try {
			int[] a = new int[3];
			a[0]=9;
			a[1]=5;
			a[2]=8;
			a[3]=6;
			
		}catch( Exception e) {
			System.out.println("Exception is handled here");
		}
		System.out.println("Exception is handled here");
	
		
		}

}
