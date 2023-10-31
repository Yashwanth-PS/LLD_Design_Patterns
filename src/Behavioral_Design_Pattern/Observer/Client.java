package Behavioral_Design_Pattern.Observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance(); // Publisher
        CustomerNotifier customerNotifier = new CustomerNotifier();
        InventoryManager inventoryManager = new InventoryManager();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        CashBackGenerator cashBackGenerator = new CashBackGenerator();
        a.orderPlaced();
        a.deregister(cashBackGenerator);
        System.out.println("------------------------------");
        a.orderPlaced();
    }
}