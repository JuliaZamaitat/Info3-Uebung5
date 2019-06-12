package adapter;

public class WebshopPayment implements IPayment {

    public void pay(int amount){
        System.out.println("Payment recieved. Amount: " + amount);
    }
}
