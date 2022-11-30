package AGenius.Java.DesignPattern.Strategy.strategies;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
