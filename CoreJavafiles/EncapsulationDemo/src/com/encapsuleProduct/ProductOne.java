package com.encapsuleProduct;

public class ProductOne {
	public final int product = 10;// ==>>Instance Variable can access across the package or Other package
//	  with same Object 
	private final int productId = 01;
	private String productName = "Adiddas";
	private String productAddress = "Hyd";
	protected int productDate = 8;

	// getters and setters for Private variables
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductAddress() {
		return productAddress;
	}

	public void setProductAddress(String productAddress) {
		this.productAddress = productAddress;
	}

	public void methodDetails(int productId, String productName, String productMdate) {
		System.out.println(productId + "," + " , Product name " + productName + ", Manfacture date " + productMdate);

	}

	public static void main(String[] args) {
		ProductOne productObj = new ProductOne();
		System.out.println(productObj.product);
		productObj.methodDetails(01, "adidas", "5thOct");

	}

}
