package ProductDetails;

import Users.Seller;

public class Product {
	String productId;
	String cost;
	String productName;
	private Seller seller;

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		productId = productId;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
