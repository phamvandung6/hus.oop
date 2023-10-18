package hus.oop.lab4._1_6;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance.");
            return this.balance;
        }
    }

    public int transferTo(Account other, int amount) {
        if (amount <= this.balance) {
            other.balance += amount;
            this.balance -= amount;
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance.");
            return this.balance;
        }
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
