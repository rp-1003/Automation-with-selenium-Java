package mypacakge;

public class Car {
	 String CarModel;
	 int cost;
	 double milage;
	 
	// this constrcutor is simplfiying the inistializtion process
	/* public Car(String mdl, int cost1, double mage) {
		 
		 CarModel = mdl;
		 cost = cost1;
		 milage= mage;
	 } */
	 // we use this keyword to differentiate the instance variable from the parameter variable initialized in a contstructor.
	  
	 
 public Car(String model, int cost, double milage) {
		 
		 this.CarModel = model;
		 this.cost = cost;
		 this.milage= milage;
	 }
	
	 public void carDetails() {
		 
		 System.out.println("Car Model :"+ CarModel);
		 System.out.println("Car Model :"+ cost);
		 System.out.println("Car Model :"+ milage);
		 System.out.println("------------------------ :");
	 }
	 
	// overloading of constructors demo
	 
	 public Car() {
		 
		 System.out.println("this is contrsctor overloading with no parameters passed");
		 
	 }
		 
 public Car(int cost) {
		 
		 System.out.println("this is contrsctor overloading with no parameters passed");
		 
	 } 
		 
 public Car(int cost , double milage) {
	 
	 System.out.println("this is contrsctor overloading with no parameters passed");
	 
 }	 
		 
 public Car(double milage, int cost) {
	 
	 System.out.println("this is contrsctor overloading with no parameters passed");
	 
 }	 
		 
 public Car(String model, int cost) {
	 
	 System.out.println("this is contrsctor overloading with no parameters passed");
	 
 }	 
public Car(double milage, String model, int cost ) {
	 
	 System.out.println("this is contrsctor overloading with no parameters passed");
	 
 }	public Car(int cost, double milage, String model) {
	 
	 System.out.println("this is contrsctor overloading with no parameters passed");
	 
 }	  
}