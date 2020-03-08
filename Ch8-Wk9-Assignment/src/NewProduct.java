//*******************************************************************
//	ITC 115 - Assignment 9 - Product Class
//  Create client app to create instances of 2-3 different products
//    and use the toString method to display their data.
//
//	By: Mike Gilson
//	Date: 3/7/2020
//*******************************************************************

public class NewProduct {

	public static void main(String[] args) {

//  Initial print of the getCount method - should display 0		
		System.out.println("Current Product Count: " + Product.getCount());
		
//  Creating first Product object, using parameter constructor version		
		Product p1 = new Product("product1", 100123, "our first product", 19.99);
//  Calling toString method to display first product information
		System.out.println(p1.toString());
		
//  Creating second Product object, varying how price data is entered
		Product p2 = new Product("product2", 100234, "the second product created", 120);
//  Calling toString method to display second product information
		System.out.println(p2.toString());
		
//  Creating third Product object, varying how price data is entered
		Product p3 = new Product("product3", 100345, "a fancy third product", .99);
//  Calling toString method to display third product information
		System.out.println(p3.toString());
		
//  Creating fourth Product object, using empty constructor version
		Product p4 = new Product();
//  Calling toString method to display fourth product information
		System.out.println(p4.toString());
		
//  Printing the getCount method to verify tracking of created products - should display 4
		System.out.println("Current Product Count: " + Product.getCount());
	
//  Using the mutator methods to change fourth product data		
		p4.setName("product4A");
		p4.setCode(444444);
		p4.setDesc("updated description");
		p4.setPrice(10.9987);  //ensure formatted price rounds to two decimal points (11.00)
		
// Calling toString method to display updated fourth product information
		System.out.println(p4.toString());
		
//  Printing the getCount method to verify product count is still 4 after updating 
		System.out.println("Current Product Count: " + Product.getCount());
		
//  Printing to Accessor methods to verify they work properly.
		System.out.println(p1.getName());
		System.out.println(p1.getCode());
		System.out.println(p1.getDesc());
		System.out.println(p1.getPrice());
	} // end main

	
} // end NewProduct class
