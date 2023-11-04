package Behavioral_Design_Pattern.Observer;
// Subscriber --> Listens to some event and takes some action
public class CustomerNotifier implements OrderPlacedSubscriber{
    public CustomerNotifier(){
        Amazon a = Amazon.getInstance();
        a.register(this);
    }
    @Override
    public DataHolder orderPlaceEvent() {
        DataHolder data = new DataHolder("Customer is being Notified");
        System.out.println("Customer is being Notified");
        return data;
    }
}