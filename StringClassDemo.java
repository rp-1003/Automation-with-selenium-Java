package mypacakge;

public class StringClassDemo {

	public static void main(String[] args) {
		
		String name = new String("Roopa Patil");  // this the full systax of defining a string variable
		
		// short cut to create String datatype
		
		
		String Firstname ="    Deepa";
		String Lastname = "Mehtamalini";
		//System.out.println(Firstname.trim());
		//System.out.println(name.indexOf(name));
		
		
		String s1 = "Selenium WebDriver the driver to g the why ";
		 String [] a = s1.split(" ");
		//System.out.println(s1.indexOf("IDE"));
		for(String i:a) {
		 
		System.out.println(i);
		}
		}

	}

