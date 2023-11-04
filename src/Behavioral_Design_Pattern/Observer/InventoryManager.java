package Behavioral_Design_Pattern.Observer;
// Subscriber --> Listens to some event and takes some action
public class InventoryManager implements OrderPlacedSubscriber{
    public InventoryManager() {
        Amazon a = Amazon.getInstance();
        a.register(this);
    }
    @Override
    public DataHolder orderPlaceEvent() {
        DataHolder data = new DataHolder("Inventory is being Updated");
        System.out.println("Inventory is being Updated");
        return data;
    }
}