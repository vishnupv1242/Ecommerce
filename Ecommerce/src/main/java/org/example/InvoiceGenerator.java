package org.example;

public class InvoiceGenerator {
    public void generateInvoice(Order order) {
        System.out.println("Invoice generated for Order ID: " + order.getOrderId());
    }
}
