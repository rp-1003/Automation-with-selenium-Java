package mypacakge;

public class wrapperclass {

	public static void main(String[] args) {
		
		
		// any time if we want to convert the tprimitive datat type into wrapper classess we can use
		
		String a ="100"; // here 100 is string literral.
			System.out.println(a+15); // output will be 10015 as 100 is string henvce it will be concatinated with `15

			
			// converting string text into number text
			int anum = Integer.parseInt(a);  // here integer is the wrapper class used to convert the string to in to int.
			
			System.out.println(anum+15);
			
			
	}

}
