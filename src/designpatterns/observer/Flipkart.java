package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlaceSubscriber> orderPlaceSubscriberList=new ArrayList<>();
    void registerSubscriber(OrderPlaceSubscriber orderPlaceSubscriber){
        orderPlaceSubscriberList.add(orderPlaceSubscriber);
    }
    void unregisterSubscriber(OrderPlaceSubscriber orderPlaceSubscriber){
        orderPlaceSubscriberList.remove(orderPlaceSubscriber);
    }
    static Flipkart getInstance(){
        if(instance==null){
            instance=new Flipkart();
        }
        return instance;
    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        NotificationService notificationService=new NotificationService();
        InventoryService inventoryService=new InventoryService();

        for(OrderPlaceSubscriber orderPlaceSubscriber: getInstance().orderPlaceSubscriberList){
            orderPlaceSubscriber.orderPlaced();
        }
    }
}
