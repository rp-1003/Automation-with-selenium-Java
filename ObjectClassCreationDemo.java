package mypacakge;

public class ObjectClassCreationDemo {

	public static void main(String[] args) {
		
	 ObjectCarClass bmw = new ObjectCarClass();
	 ObjectCarClass audi = new ObjectCarClass();
	 ObjectCarClass mercedes = new ObjectCarClass();
	 
	 // initializing the object 
	 
	 bmw.color = "Black";
	 bmw.model =" bmw supreme";
	 bmw.milage= 12;
	 bmw.cost = 60000;
	 bmw.startcar();
	 bmw.stopcar();
	 bmw.carDetails();
	  
System.out.println("------------------------------------");
	 audi.color ="white";
	 audi.model=" audi first";
	 audi.milage=15;
	 audi.cost = 75000;
	 audi.startcar();
	 audi.stopcar();
	 audi.carDetails();
	  
System.out.println("------------------------------------");
	 mercedes.color="red";
	 mercedes.model="mercedes a1";
	 mercedes.milage=18;
	 mercedes.cost=80000;
	  mercedes.startcar();
	  mercedes.stopcar();
	  mercedes.carDetails();
	  
	  
	  
	  
	}

}
