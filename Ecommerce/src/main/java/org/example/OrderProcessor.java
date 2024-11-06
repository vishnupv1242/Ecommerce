package org.example;

import org.example.IPaymentProcessor;

public class OrderProcessor {
    private IPaymentProcessor paymentProcessor;
    private InvoiceGenerator invoiceGenerator;

    public OrderProcessor(IPaymentProcessor paymentProcessor, InvoiceGenerator invoiceGenerator) {
        this.paymentProcessor = paymentProcessor;
        this.invoiceGenerator = invoiceGenerator;
    }

    public void processOrder(Order order) {
        double totalAmount = order.getProducts().stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

        paymentProcessor.processPayment(totalAmount);
        invoiceGenerator.generateInvoice(order);
    }
}
