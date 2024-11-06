import org.example.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, 10);
        Product product2 = new Product("Mouse", 20, 50);

        Customer customer = new Customer("John Doe", "john@example.com", "123 Main St");


        Order order = new Order(1, customer);
        order.addProduct(product1);
        order.addProduct(product2);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        IPaymentProcessor paymentProcessor = new CreditCardProcessor();

        OrderProcessor orderProcessor = new OrderProcessor(paymentProcessor, invoiceGenerator);
        orderProcessor.processOrder(order);
    }
}
