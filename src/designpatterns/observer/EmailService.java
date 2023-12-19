package designpatterns.observer;

public class EmailService implements OrderPlaceSubscriber{
    EmailService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("notfied via email");
    }
}
