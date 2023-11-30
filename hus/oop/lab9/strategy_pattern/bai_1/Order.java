package hus.oop.lab9.strategy_pattern.bai_1;

/**
 * Order class. Doesn't know the concrete payment method (strategy) the user has
 * picked.
 * It uses a common strategy interface to delegate collecting payment data to
 * the strategy object.
 * It can be used to save the order to the database.
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrderUsingPaypal(PayByPaypal paypal) {
        paypal.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}