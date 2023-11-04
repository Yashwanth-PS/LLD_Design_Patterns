package Behavioral_Design_Pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon { // Publisher --> where the event actually happens
    private List<OrderPlacedSubscriber> orderPlacedSubscribers; // Contains list of subscriber objects
    private static Amazon instance;
    private Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
    }
    public void orderPlaced(){ // Event Method
        for(OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlaceEvent();
        }
    }
    public void register(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }
    public void deregister(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
    public static Amazon getInstance() { // Singleton Object/Instance
        if (instance == null) {
            synchronized (Amazon.class) {
                if (instance == null) {
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }
}