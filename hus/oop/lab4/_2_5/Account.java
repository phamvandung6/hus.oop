package hus.oop.lab4._2_5;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getIdD() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer + "balance=" + balance;
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return this;
        } else {
            System.out.println("amount withdrawn exceeds the current balance");
            return this;
        }
    }

}
