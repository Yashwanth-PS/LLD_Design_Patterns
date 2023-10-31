package Behavioral_Design_Pattern.Observer;
// Subscriber --> Listens to some event and takes some action
public class CustomerNotifier implements OrderPlacedSubscriber{
    public CustomerNotifier(){
        Amazon a = Amazon.getInstance();
        a.register(this);
    }
    @Override
    public DataHolder orderPlaceEvent() {
        DataHolder data = new DataHolder("Notify the customer regarding order is placed");
        System.out.println("Notify the customer regarding order is placed");
        return data;
    }
}