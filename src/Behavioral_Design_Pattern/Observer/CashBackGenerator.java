package Behavioral_Design_Pattern.Observer;
// Subscriber --> Listens to some event and takes some action
public class CashBackGenerator implements OrderPlacedSubscriber{
    public CashBackGenerator(){
        Amazon a = Amazon.getInstance();
        a.register(this);
    }
    @Override
    public DataHolder orderPlaceEvent() {
        DataHolder data = new DataHolder("Cashback Generated");
        System.out.println("Cashback is being Generated");
        return data;
    }
}
