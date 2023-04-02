package Ecommerce;

import java.util.Scanner;

import Orders.Cart;
import ProductDetails.Catalogue;
import ProductDetails.Product;
import Users.Customer;
import Users.Seller;


public class Store {
    public static void main(String[] args) {
        System.out.println("Welcome to Ecommerce Website! ");
        System.out.println("What type of user you are? 1.Customer 2. Seller 3.Admin ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        String typeOfUser;
        if (choose == 1){
            typeOfUser = "Customer";
            Customer current = new Customer();
            System.out.println("Enter userId: ");
            sc.nextLine();
            current.setUserId(sc.nextLine());
            System.out.println("Enter password: ");
            sc.nextLine();
            current.setPassword(sc.nextLine());
            if (current.verifyUser()== true){
                System.out.println("User verified :) ");
                while (true){

                    System.out.println("Do you want to- 1. View product 2. View cart 3.Contact Us 4. Exit");
                    choose= sc.nextInt();
                    if (choose == 1){
                        Catalogue catalogue = new Catalogue();
                        Product[] allProducts = catalogue.getListOfAllProduct();
                        for (int i=0; i< allProducts.length; i++){
                            System.out.println(allProducts[i].getProductId() +" "+allProducts[i].getProductName()+" "+ allProducts[i].getCost());
                        }
                        System.out.println("Do you want to add any product to the cart? Y/N ");
                        sc.nextLine();
                        String addToCart = sc.nextLine();
                        if (addToCart.equals("Y"))
                        {
                            System.out.println(" Input the product id of the product which you want to add to cart...");
                            String productId = sc.nextLine();
                            Product[] cartProduct = new Product[1];
                            for (int i=0; i< allProducts.length; i++){
                                if (allProducts[i].getProductId().equals(productId))
                                    cartProduct[0] = allProducts[i];
                            }

                            Cart cart = new Cart();
                            cart.setCartId("1");
                            cart.setListOfProduct(cartProduct);
                            current.setCart(cart);
                            System.out.println("the product is successfully added to the cart");
                        }
                    }
                    else if (choose == 2) {
                        Product[] cartProducts = current.getCart().getListOfProduct();
                        System.out.println(current.getCart().getCartId());
                        for (int i=0; i< cartProducts.length; i++){
                            System.out.println(cartProducts[i].getProductId() +" "+cartProducts[i].getProductName()+" "+ cartProducts[i].getCost());
                        }
                        System.out.println("Do you want to add any product to the cart? Y/N ");
                        sc.nextLine();
                        String checkout = sc.nextLine();
                        if (checkout.equals("Y"))
                            if(current.getCart().checkOut())

                                System.out.println(" Your order is placed successfully.");

                    }
                    else if (choose == 3){
                        System.out.println( " To contact us,please email shop99@vv.com");
                    }
                    else if (choose == 4)
                        break;
                    else
                        System.out.println("Invalid choice, please try again");

                }
            }
        }
        else if (choose == 2){
            typeOfUser = "Seller";
            Seller current = new Seller();
            System.out.println("Enter userId: ");
            sc.nextLine();
            current.setUserId(sc.nextLine());
            System.out.println("Enter password: ");
            sc.nextLine();
            current.setPassword(sc.nextLine());
            if(current.verifyUser()== true){
                System.out.println("user verified :)");
                while (true){
                    System.out.println("do you want 1.view product  2.view cart  3. sell product 4. contact us 5. exit");
                    choose= sc.nextInt();
                    if(choose==1){
                        Catalogue catalogue = new Catalogue();
                        Product[] allProducts = catalogue.getListOfAllProduct();
                        for (int i=0; i< allProducts.length; i++){
                            System.out.println(allProducts[i].getProductId() +" "+allProducts[i].getProductName()+" "+ allProducts[i].getCost());
                        }
                        System.out.println("Do you want to add any product to the cart? Y/N ");
                        sc.nextLine();
                        String addToCart = sc.nextLine();
                        if (addToCart.equals("Y")){
                            System.out.println(" Input the product id of the product which you want to add to cart...");
                            String productId = sc.nextLine();
                            Product[] cartProduct = new Product[1];
                            for (int i=0; i< allProducts.length; i++) {
                                if (allProducts[i].getProductId().equals(productId))
                                    cartProduct[0] = allProducts[i];
                            }
                            Cart cart = new Cart();
                            cart.setCartId("1");
                            cart.setListOfProduct(cartProduct);
                            current.setCart(cart);
                            System.out.println("the product is successfully added to the cart");
                        }
                    }
                    else if (choose == 2) {
                        Product[] cartProducts = current.getCart().getListOfProduct();
                        System.out.println(current.getCart().getCartId());
                        for (int i=0; i< cartProducts.length; i++){
                            System.out.println(cartProducts[i].getProductId() +" "+cartProducts[i].getProductName()+" "+ cartProducts[i].getCost());
                        }
                        System.out.println("Do you want to add any product to the cart? Y/N ");
                        sc.nextLine();
                        String checkout = sc.nextLine();
                        if (checkout.equals("Y"))
                            if(current.getCart().checkOut())

                                System.out.println(" Your order is placed successfully.");
                    }else if (choose == 3){
                        System.out.println( " adding product to website is successful");
                    }
                    else if (choose == 4){
                        System.out.println( " To contact us,please email shop99@vv.com");
                    }
                    else if (choose == 5)
                        break;
                    else
                        System.out.println("Invalid choice, please try again");
                }
            }
        }
        else if (choose == 3){
            typeOfUser = "Admin";
            Admin current = new Admin();
            System.out.println("Enter userId: ");
            sc.nextLine();
            current.setUserId(sc.nextLine());
            System.out.println("Enter password: ");
            sc.nextLine();
            current.setPassword(sc.nextLine());
            if (current.verifyUser()== true){
                System.out.println("user verified :)");
            }
            while (true){
                System.out.println("do you want 1.view product  2.view cart  3. check product 4. contact us 5. exit");
                choose= sc.nextInt();
                if(choose==1){
                    Catalogue catalogue = new Catalogue();
                    Product[] allProducts = catalogue.getListOfAllProduct();
                    for (int i=0; i< allProducts.length; i++){
                        System.out.println(allProducts[i].getProductId() +" "+allProducts[i].getProductName()+" "+ allProducts[i].getCost());
                    }
                    System.out.println("Do you want to add any product to the cart? Y/N ");
                    sc.nextLine();
                    String addToCart = sc.nextLine();
                    if (addToCart.equals("Y")) {
                        System.out.println(" Input the product id of the product which you want to add to cart...");
                        String productId = sc.nextLine();
                        Product[] cartProduct = new Product[1];
                        for (int i=0; i< allProducts.length; i++){
                            if (allProducts[i].getProductId().equals(productId))
                                cartProduct[0] = allProducts[i];
                        }
                        Cart cart = new Cart();
                        cart.setCartId("1");
                        cart.setListOfProduct(cartProduct);
                        current.setCart(cart);
                        System.out.println("the product is successfully added to the cart");
                    }
                }
                else if (choose == 2){
                    Product[] cartProducts = current.getCart().getListOfProduct();
                    System.out.println(current.getCart().getCartId());
                    for (int i=0; i< cartProducts.length; i++){
                        System.out.println(cartProducts[i].getProductId() +" "+cartProducts[i].getProductName()+" "+ cartProducts[i].getCost());
                    }
                    System.out.println("Do you want to add any product to the cart? Y/N ");
                    sc.nextLine();
                    String checkout = sc.nextLine();
                    if (checkout.equals("Y"))
                        if(current.getCart().checkOut())

                            System.out.println(" Your order is placed successfully.");
                }
                else if (choose == 3){
                    System.out.println( " Checking the  product  is successful done");
                }
                else if (choose == 4){
                    System.out.println( " To contact us,please email shop99@vv.com");
                }
                else if (choose == 5)
                    break;
                else
                    System.out.println("Invalid choice, please try again");
            }
        }
        else
            System.out.println("Invalid input. try again");
    }
}