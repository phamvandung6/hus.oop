package hus.oop.lab4._2_2;

import java.util.Arrays;

import hus.oop.lab4._2_1.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
                + "]";
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author: authors) {
            if (authorNames.length() > 0) {
                authorNames.append(", ");

            }
            authorNames.append(author.getName());
        }
        return authorNames.toString();
    }

}
