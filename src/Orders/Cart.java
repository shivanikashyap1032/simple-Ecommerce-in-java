package Orders;

import ProductDetails.Product;

public class Cart {
	String cartId;
	private Product[] listOfProduct;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	private Product[] listOfProducts;

	public Product[] getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(Product[] listOfProduct) {
		this.listOfProduct = listOfProduct;
	}

	public Boolean checkOut() {
		return true;
	}
}
