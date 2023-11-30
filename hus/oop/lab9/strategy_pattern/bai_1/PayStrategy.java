package hus.oop.lab9.strategy_pattern.bai_1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();   
}