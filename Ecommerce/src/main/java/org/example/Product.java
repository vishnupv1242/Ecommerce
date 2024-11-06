package org.example;

public class Product implements IStockManager {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getDetails() {
        return name + " - $" + price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public boolean checkStock(int quantity) {
        return stock >= quantity;
    }

    @Override
    public void updateStock(int quantity) {
        if (checkStock(quantity)) {
            stock -= quantity;
        }
    }
}
