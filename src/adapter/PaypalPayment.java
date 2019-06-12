package adapter;

public class PaypalPayment {
    private String username;
    private String password;
    private int amount;
    private String recipient;
    private boolean loggedIn;

    public boolean login(String name,String password){
        this.username = name;
        this.password = password;
        System.out.println(this.username + " is logged in.");
        return true;
    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public void setAmount(int amount){
        this.amount = amount;
        System.out.println("The amount is set to " + amount);
    }

    public void confirm(){
        System.out.println("Payment confirmed for "+ username + " to: " + recipient) ;
    }
}
