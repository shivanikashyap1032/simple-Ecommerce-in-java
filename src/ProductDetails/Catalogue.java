package ProductDetails;

import java.util.Scanner;

public class Catalogue {
	private Product[] listOfAllProducts;

	public Product[] getListOfAllProduct() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("product1");
		product1.setCost("1000");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("product2");
		product2.setCost("2000");
		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("product3");
		product3.setCost("3000");
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("product4");
		product4.setCost("4000");
		listOfAllProducts = new Product[4];
		listOfAllProducts[0] = product1;
		listOfAllProducts[1] = product2;
		listOfAllProducts[2] = product3;
		listOfAllProducts[3] = product4;
		return listOfAllProducts;
	}

	public void setListOfAllProduct(Product[] listOfAllProduct) {
		this.listOfAllProducts = listOfAllProduct;
	}
}
