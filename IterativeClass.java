package mypacakge;

public class IterativeClass {

	public static void main(String[] args) {
		// if i want to print 10 line with diffrent variable value i need t oype the line 10 times.
		// hence we use loops. to execute the block of statments multiple times or the 
		
		
		// while loop##
		
		//----------------------------------
		// excuting the same block of stament untile the condition becomes false.
		
	
	//	int a = 5, b=4;
	/*	while(a>b) {
			 System.out.println("inside the while loop --a is greater than b"); // this statementbecomes and infiteite times as a will always be grerater than b to come out use the red button to stop the program execution.
		}
		*/

	/*	int i=0;
		while(i<5) {
			System.out.println("inside the while lloop --i is :" + i);
			i++;
		}
		// untile the condition becomes false the while will be executed.
		
	
// do while loop
		int i=0;
		do {
			 System.out.println("Inside while block"+i);
			 i++;
		}while(i<5); 
	
		// common loop is for look it simplifies the process of defining the loop.
		
			for(int i=0;i<5;i++) { //Initialisation, condition,increment
			System.out.println("inside for loop"+ i);
		} */
		
	
	
	/* for (int p=0;p<10;p++){
		if(p==5) {  // to skip only certain value , here when p is 5 that value will be skipped but the rest will continue. 
			// if you given break here the loop will execute till p become 5 then the loop comes out or stops.
			continue;
		}
		System.out.println("the value of a9 is :" + p);
		
	*/
	int p=0;
	while(p<10) {
		if(p==3) {
			p++;
			continue;
		}
		
				System.out.println("the value of p i :"+ p);
		p++;
		
	}
	}

}
