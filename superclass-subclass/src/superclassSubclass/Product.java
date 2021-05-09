
package superclassSubclass;

/** Personel and Content of Application Information
 * Name / Surname 		: Faruk Yahya AKSU
 * Created By			: 25.04.2021
 *       				: OOP - Java
 * Content of App    	: "Write a Java superclass Product and two subclasses Clothing and Furniture with the following UML diagram."
 *
 * Notes 2 : This program was written using the eclipse program.
 */
public class Product {

	private String productName;
	private String productCode;
	private String discription;
	private String vendorName;
	private double unitPrice;
	private int stockAmount;
	public static int numberOfProducts;
	
	public Product(String productName, String productCode, String discription, String vendorName) {
		this.productName = productName;
		this.productCode = productCode;
		this.discription = discription;
		this.vendorName = vendorName;
		
		numberOfProducts++;
	}
	
	public Product(String productName, String productCode, String discription, String vendorName, double unitPrice, int stockAmount) {
		this.productName = productName;
		this.productCode = productCode;
		this.discription = discription;
		this.vendorName = vendorName;
		this.unitPrice = unitPrice;
		this.stockAmount = stockAmount;
		
		numberOfProducts++;
	}
	
	public void setDiscription(String discription) {
		this.discription = discription;
		return;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
		return;
	}
	
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
		return;
	}
	
	public String getProductName() {
	
		return productName;
	}
	
	public String getProductCode() {
		
		return productCode;
	}
	
	public String getVendorName() {
		
		return vendorName;
	}
	
	public String getDiscription() {
		
		return discription;
	}
	
	public double getUnitPrice() {
		
		return unitPrice;
	}
	
	public int getStockAmount() {
		
		return stockAmount;
	}
	@Override
	public String toString() {
		
		return String.format("%s: %s %n%s: %s %n%s: %s%n%s: %s%n%s: %.2f%s%n%s: %d%n%n",
				"Product Name", getProductName(),
				"Product Code", getProductCode(),
				"Description", getDiscription(),
				"Vendor Name", getVendorName(),
				"Unit Price", getUnitPrice(), " TL",
				"Stock Amount", getStockAmount());
	}
	
	public static void main(String[] args) {
		
		Product.numberOfProducts = 0;
		
		//Products -> 2
		Product[] myProducts = new Product[2];
		myProducts[0] = new Product("Scrabble", "1111-1111", "Classic Scrabble game has the letter tiles and game guide for a wordy showdown", " Hasbro Gaming");
		myProducts[0].setUnitPrice(20.50);
		myProducts[0].setStockAmount(30);
		System.out.print(myProducts[0].toString());
		
		myProducts[1] = new Product("Backgammon", "1111-1112", "CLASSIC BOARD GAME: This classic backgammon game is the perfect set for beginners and advanced players", "Crazy Games");
		myProducts[1].setUnitPrice(39.95);
		myProducts[1].setStockAmount(40);
		System.out.print(myProducts[1].toString());
		
		//Clothings -> 2
		Clothing[] myClothings = new Clothing[2];
		myClothings[0] = new Clothing("Men's Shirt", "2222-1111", "55% Linen, 45% Cotton", "Calvin Klein", 2, "Blue");
		myClothings[0].setUnitPrice(50.00);
		myClothings[0].setStockAmount(10);
		System.out.print(myClothings[0].toString());
		
		myClothings[1] = new Clothing("Dress", "2222-1112", "95% Polyester, 5% Spandex", "Network", 3, "Black");
		myClothings[0].setUnitPrice(20.85);
		myClothings[0].setStockAmount(25);
		System.out.print(myClothings[1].toString());
		
		//Furniture -> 2
		Furniture[] myFurnitures = new Furniture[2];
		myFurnitures[0] = new Furniture("Table", "3333-1111", "Engineered Wood, Alloy Steel, Plastic", "Ikea", 152.30, 45.50 , 55.30);
		myFurnitures[0].setUnitPrice(1999.99);
		myFurnitures[0].setStockAmount(2);
		System.out.print(myFurnitures[0].toString());
		
		myFurnitures[1] = new Furniture("Wardrobe", "3333-1112", "Wood", "Koçtaþ", 100.00, 180.00, 60.00);
		myFurnitures[1].setUnitPrice(499.99);
		myFurnitures[1].setStockAmount(40);
		System.out.print(myFurnitures[1].toString());
		
		//Sofas -> 2
		Sofa[] mySofas = new Sofa[2];
		mySofas[0] = new Sofa("Sofa L Shape", "4444-1111", "Convertible, Sleeper, Sectional", "Ikea", 300.00, 60.00 , 60.00, "Velvet", "Gray");
		mySofas[0].setUnitPrice(0.00);
		mySofas[0].setStockAmount(0);
		System.out.print(mySofas[0].toString());
		
		mySofas[1] = new Sofa("Sofa Bed", "4444-1112", "Foam Padding, Eucalyptus Wood, Metal Legs", "Koçtaþ", 200.00, 60.00, 60.00, "Cotton", "Blue");
		mySofas[1].setUnitPrice(1200.00);
		mySofas[1].setStockAmount(40);
		System.out.print(mySofas[1].toString());
		
		//Number of Products
		System.out.print("Number of Products Created: " + Product.numberOfProducts );

	}

}
