package mypacakge;

public class CarDemoClass1 {

	public static void main(String[] args) {
		
		Car benz = new Car("Benz A-Class",300000,10.12);
		benz.carDetails();
		
		/* benz.CarModel = ;
		benz.cost = 300000;
		benz.milage = 10.12;
		benz.carDetails(); */ // thiis initialization is for without constrcurto definition.
		

		Car audi = new Car("Audi supreme",6000000,2.99);
		audi.carDetails();
						
		/*audi.CarModel= ;
		audi.milage = 12.99;
		audi.cost= 6000000;
		
		audi.carDetails(); */
		
	}

}
