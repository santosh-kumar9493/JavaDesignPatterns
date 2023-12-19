package designpatterns.observer;

public class NotificationService implements OrderPlaceSubscriber{
    NotificationService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void orderPlaced() {
        System.out.println("Notfied user ");
    }
}
