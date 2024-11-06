package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private int orderId;
    private Customer customer; // New attribute

    public Order(int orderId, Customer customer) { // Updated constructor
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }
}
