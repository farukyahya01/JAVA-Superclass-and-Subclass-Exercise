package superclassSubclass;

public class Sofa extends Furniture{

	private String fabricType;
	private String fabricColor;
	
	public Sofa(String productName, String productCode, String discription, String vendorName, double length, double height, double width, String fabricType, String fabricColor) {
		super(productName, productCode, discription, vendorName, length, height, width);
		this.fabricType = fabricType;
		this.fabricColor = fabricColor;
	
	}
	
	public Sofa(String productName, String productCode, String discription, String vendorName, double unitPrice, int stockAmount, double length, double height, double width, String fabricType, String fabricColor) {
		super(productName, productCode, discription, vendorName,unitPrice, stockAmount, length, height, width);
		this.fabricType = fabricType;
		this.fabricColor = fabricColor;
	}
	
	
	public String getFabricType() {
	
		return fabricType;
	}
	
	public String getFabricColor() {
		
		return fabricColor;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s%s: %s%n%s: %s%n%n",
				super.toString(),
				"Fabric Type", getFabricType(),
				"Fabric Color", getFabricColor());
	}
	
}
