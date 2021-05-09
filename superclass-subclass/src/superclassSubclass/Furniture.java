
package superclassSubclass;

public class Furniture extends Product {

	private double length;
	private double height;
	private double width;
	
	
	public Furniture(String productName, String productCode, String discription, String vendorName, double length, double height, double width) {
		super(productName, productCode, discription, vendorName);
		this.length = length;
		this.height = height;
		this.width = width;
		
	}
	
	public Furniture(String productName, String productCode, String discription, String vendorName, double unitPrice, int stockAmount, double length, double height, double width) {
		super(productName, productCode, discription, vendorName, unitPrice, stockAmount);
		this.length = length;
		this.height = height;
		this.width = width;
		
	}
	
	
	public double getLength() {
	
		return length;
	}
	
	public double getHeight() {
		
		return height;
	}
	
	public double getWidth() {
		
		return width;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s%s: %.2f %s%n%s: %.2f %s%n%s: %.2f %s%n%n",
				super.toString(),
				"Length", getLength(), "cm",
				"Height", getHeight(), "cm",
				"Width", getWidth(), "cm");
	}
}
