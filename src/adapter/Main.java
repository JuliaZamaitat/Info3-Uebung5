package adapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("---Webshop-Payment---");
        IPayment webshopPayment = new WebshopPayment();
        webshopPayment.pay(20);

        System.out.println("---PayPal-Payment---");
        PaypalPayment ppp = new PaypalPayment();
        IPayment paypalPayment = new PaypalAdapter(ppp);
        paypalPayment.pay(50);

    }
}
