package Behavioral_Design_Pattern.Observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance(); // Publisher
        CustomerNotifier customerNotifier = new CustomerNotifier();
        InventoryManager inventoryManager = new InventoryManager();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        CashBackGenerator cashBackGenerator = new CashBackGenerator();
        a.orderPlaced();
        System.out.println("------------------------------");
        a.deregister(cashBackGenerator);
        a.orderPlaced();
    }
}

/* Steps for Implementation of Observer Design Pattern:

1] Create the Publisher which contains a list of Subscriber Objects
2] Create a methods in publisher that allows subscribers to register and deregister
3] Create the DataHolder Class
4] Create the Interface for the Subscribers
5] Create the Subscriber classes which should implement the interface
6] Create the Client Class */