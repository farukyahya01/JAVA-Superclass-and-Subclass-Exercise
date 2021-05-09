package superclassSubclass;

public class Clothing extends Product {

	private int size;
	private String color;
	
	public Clothing(String productName, String productCode, String discription, String vendorName, int size, String color) {
		super(productName, productCode, discription, vendorName);
		this.size = size;
		this.color = color;

	}
	
	public Clothing(String productName, String productCode, String discription, String vendorName, double unitPrice, int stockAmount, int size, String color) {
		super(productName, productCode, discription, vendorName, unitPrice, stockAmount);
		this.size = size;
		this.color = color;

	}
	
	public int getSize() {
	
		return size;
	}
	
	public String getColor() {
		
		return color;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%s%s: %d%n%s: %s%n%n",
				super.toString(),
				"Size", getSize(),
				"Color", getColor());
	}
}
