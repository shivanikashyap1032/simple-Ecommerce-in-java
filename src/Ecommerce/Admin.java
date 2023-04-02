package Ecommerce;

import Orders.Cart;
import Users.User;
public class Admin{
    private Cart cart;
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public Boolean verifyUser(){
        return true;
    }
	public void setPassword(String nextLine) {	
		
	}
	public void setUserId(String nextLine) {
	
	}
}

