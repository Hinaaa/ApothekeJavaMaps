package org.example;

public class Medication {
    private String name;
    private double price;
    private String availability;

    Medication(String name, double price, String availability) { //Constructor
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability='" + availability + '\'' +
                '}';
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
