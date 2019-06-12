package adapter;

public class PaypalAdapter implements IPayment {
    PaypalPayment payment;

   public PaypalAdapter(PaypalPayment payment){
       this.payment = payment;
   }

    public void pay(int amount){
       payment.login("Hans", "123");
       payment.setRecipient("Peter");
       payment.setAmount(amount);
       payment.confirm();
    }
}
