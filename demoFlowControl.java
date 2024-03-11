package mypacakge;

public class demoFlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // the defalut flow control is line by line, by using the flow control statement we can change whicline of codes to executeed at run time
	
		// Flow statememnt 3 types
		//1. selecton statements   if, if else, if .. else if ..else, switch
		//2. iterative statements   while, do while, for loop, for each loop.
		// 3 transfer statements.
		
		// when the cvondtion is given based on the outcome of the condition true or false the staements will be ececuted.
		
		// in case if if block there is 1 block
		int a =8 , b =6;
		
		if (a>b) {
			System.out.println("the bocl is execute fi the contifion is met ");
		}
		
		
		
		// if else block will have 2 blocks
		//----------------------------------------
		
		int c =5 , d=3;	
		
		if (c>d) {
			
			System.out.println("Inside the if block as c is greater than d");
		
		}else {
			
			System.out.println("print else block if c is less than d");		}
		
	
	// if else if else [ 3 contions are checked] only the bolc whih has conditiopn true will be eecuted and rest statements are ignored.
		
		//-----------------------------
	// if all if consitiupons are failed then else bockl will be executed.
		
		
		int x=5 , y=4, z=8,xy=2,xz=1;
		
		if (x<y) {
			
			System.out.println("Inside if block  will be execute --when x is less than y");
		
		}else if (y<z) {
			System.out.println("Inside first else if block - y less then z will pre executed");
		}else if (z<xy) {
			System.out.println("nside second else if block - z less then xy will pre executed");
		}else if (xy < xz){
			System.out.println("side second else if block - xy less then xz will pre executed-");
		}else {
			System.out.println("Inside else block -xz is the least number will be printed");
		}
		
	// switch slection statement
		// if the ondition expression results in case 0 then the case 0 will be excuted and break staement the contol will come out and rest of the stements are ignored.
		
		// if the condition experession is not matching any caseds then it will execuste the default case.
		
		
		int a3 = 9;
		
		switch(a3) {
		case 0:
			System.out.println("inside the case 0");
			System.out.println("inside the case 0");
			System.out.println("inside the case 0");
			System.out.println("inside the case 0");
			break;
		case 1:
			System.out.println("inside the case 1");
			System.out.println("inside the case 1");
			System.out.println("inside the case 1");
			System.out.println("inside the case 1");
			break;
		case 2:
			
			System.out.println("inside the case 2");
			System.out.println("inside the case 2");
			System.out.println("inside the case 2");
			System.out.println("inside the case 2");
			break;
		default:
			System.out.println("inside the case defalut ");
			
			
		}
	
		
		
		
		
		
		
		
	
	}

}
