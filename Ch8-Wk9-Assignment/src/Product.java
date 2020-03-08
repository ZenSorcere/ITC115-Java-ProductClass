//*******************************************************************
//	ITC 115 - Assignment 9 - Product Class
//  Design and Code a class for a generic product.
//  The product data should include a product code, description, price
//    and product count.
//  In addition to the getter and setter methods, the class should
//    implement toString and also a formatted output of the price, using
//    the NumberFormat class.
//  Optional: Keep track of the count of the products created and call
//    the getCount method to verify that it is correct. 
//
//	By: Mike Gilson
//	Date: 3/7/2020
//*******************************************************************


import java.text.*; // for using the NumberFormat Class
public class Product {
	
//  Fields - all data fields are encapsulated save for productCount which is public and
//    static as it's a global method.	
	private String productName;      // name of the product 
	private int productCode;         // numeric code
	private String productDesc;      // short text description
	private double productPrice;     // price of product
	public static int productCount;  // integer counter method
	
	
//  Constructors - one that requires the 4 necessary variables lined up with the Fields,
//    and one empty one, with default initializations for ease of differentiating.
	
//  The productCount method is iterated any time an object is created.	
	public Product (String name, int code, String description, double price) {
		productName = name;       // alternatively: "this.name = name", or 
		productCode = code;       //   "this.productName = productName" 
		productDesc = description;
		productPrice = price;
		productCount ++;
	} // end parameter Product method constructor
	
	public Product() {
		productName = null;
		productCode = -1;
		productDesc = null;
		productPrice = -1;
		productCount ++;
	} // end generic Product method constructor
	
//  Setters-Mutators - methods to edit existing product information
	public void setName(String name) {
		productName = name;
	} // end setName method
	
	public void setCode(int code) {
		productCode = code;
	} // end setCode method
	
	public void setDesc(String desc) {
		productDesc = desc;
	} // end setDesc method
	
	public void setPrice(double price) {
		productPrice = price;
	} // end setPrice method
	
//  Setters-Accessors - methods that return the private field info
	public String getName() {
		return productName;
	} // end getName method
	
	public int getCode() {
		return productCode;
	} // end getCode method
	
	public String getDesc() {
		return productDesc;
	} // end getDesc method
	
	public double getPrice() {
		return productPrice;
	} // end getPrice method
	
	// this method will return the current productCount number.
	public static int getCount() {
		return productCount;
	} // end getCount method
	
//  toString method - will return all product data on separate lines,
//	  including formatted price.
	public String toString() {
		return "Product: " + this.getName() + "\nCode: " + this.getCode() + "\nPrice: "
				+ getPriceFormatted() + "\nDescription: " + this.getDesc();
	} // end toString method
	
//  priceFormat method - code used from assignment description, adjusted for 
//    the actual price variable from the Fields.	
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
        return formattedPrice;
    } // end getPriceFormatted method

		
} //end class


/* Alternatively, the getPrice method could be adjusted to a String type and 
 *   return the NumberFormat from line 99. This would allow the getPrice method
 *    to display the price in a formatted way. The toString method could then
 *   be adjusted to show "this.getPrice()" instead of calling the getPriceFormatted
 *   method. However, it could be useful to have the getPrice method return exactly
 *   what was entered in for bug tracking needs.
 */

