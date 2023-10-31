package Behavioral_Design_Pattern.Observer;
public interface OrderPlacedSubscriber { // Structure of a Subscriber
    // Any class that wants to become a subscriber for Order Placed Event
    // i.e. Wants to consume order placed event then that class should implement this interface
    DataHolder orderPlaceEvent(); // Action that we need to perform when an Order Placed Event is consumed
}