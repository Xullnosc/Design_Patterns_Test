package StrategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {

    }
}

interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}

class Creditcard{
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public Creditcard(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
}



class PaymentByCreditCard implements PaymentStrategy {
    Creditcard creditcard;
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collect payment details");
        creditcard = new Creditcard("Card Number", "cvv", "Expiry Date");
    }
    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validate payment details");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying : " + amount +"with credit card");
    }

}
class PayPalAccount{
    private String email;
    private String password;
    public PayPalAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }
}

class PaymentByPayPal implements PaymentStrategy {
    PayPalAccount payPalAccount;
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collect payment details");
        payPalAccount = new PayPalAccount("email", "password");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validate payment details");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying : " + amount +"with this paypal account");
    }
}


class PaymentService{
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy paymentStrategy;
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPaymentDetails() {
        paymentStrategy.collectPaymentDetails();
        if(paymentStrategy.validatePaymentDetails()){
            paymentStrategy.pay(cost);
        }
    }
}


