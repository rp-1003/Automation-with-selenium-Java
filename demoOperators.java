package mypacakge;

public class demoOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 16, b =8;
	boolean x = true, y = false, z =true, zz =false;
	// when there are multiple variable we can write in the same line.
	
	// arthemetic oiperators
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	System.out.println(a++);
	System.out.println(a--);
	
	// Relational operators
	System.out.println(a==b);  //false
	System.out.println(a!=b); //true
	System.out.println(b!=a);// true
	System.out.println(a>b); // true
	System.out.println(a<b); //false
	System.out.println(a<=b); //false
	System.out.println(b<a); //true
	System.out.println(b<=a); //true

	
	//Logical operators
	
	System.out.println(x && y);
	System.out.println(x && z);
	System.out.println(y && z);
	System.out.println(y && zz);
	System.out.println(z && zz);
	
	// or logical operator   use the double pipe symbol
	System.out.println(x || y);
	System.out.println(x || z);
	System.out.println(y || z);
	System.out.println(y || zz);
	System.out.println(z || zz);
	
	// Assignment operators
	 int i = 5;
	 i+=4; //this means i plus 4 
	 System.out.println(i);
	 
	 // conditional operators
	  int aa =2, bb =6 ;
	  boolean c = (aa > bb) ? true  : false;
	  System.out.println(c); // false
	
	  String ccc = ( aa > bb)? "Arun" : "Mann";
	  System.out.println(ccc);
	
	
	  // literals   are something different from data types 
	  int a1 = 5;
	  double d1 = 123.456;   // decimal literal
	  char c1 ='$';
	  long e1 =  1245655345L;  // long literal;
	  long ff = 12334435; // integer literal
	  float ee1 = 123.4566F; //floating point literal
	  
	  
	  System.out.println(a1);
	  System.out.println(d1);
	  System.out.println(c1);
	  System.out.println(e1);
	  System.out.println(ff);
	  
	
	// if we don't initialze to a number type 0  will be 
	  // for a boolean  defalut value is false
	  // for string values default value will be bull
	  
	  // without declaring a varibale you cannot use it.
	  
	
	
	}

}
