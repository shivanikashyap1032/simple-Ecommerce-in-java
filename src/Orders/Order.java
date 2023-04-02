package Orders;
import Users.Customer;

public class Order {
    private  String  orderId;
    private Customer user;
    public String getOrderId(){
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Customer getUsed() {
        return user;
    }public void setUsed(Customer used) {
        this.user = user;
    }
}

