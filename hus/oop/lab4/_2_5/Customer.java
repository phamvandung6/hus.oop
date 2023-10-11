package hus.oop.lab4._2_5;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int iD, String name, char gender) {
        ID = iD;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }

    

}
