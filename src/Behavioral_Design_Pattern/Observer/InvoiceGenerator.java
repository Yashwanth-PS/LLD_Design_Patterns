package Behavioral_Design_Pattern.Observer;
// Subscriber --> Listens to some event and takes some action
public class InvoiceGenerator implements OrderPlacedSubscriber{
    public InvoiceGenerator() {
        Amazon a = Amazon.getInstance();
        a.register(this);
    }
    @Override
    public DataHolder orderPlaceEvent() {
        DataHolder data = new DataHolder("Invoice is being Generated");
        System.out.println("Invoice is being Generated");
        return data;
    }
}