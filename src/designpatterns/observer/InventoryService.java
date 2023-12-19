package designpatterns.observer;

public class InventoryService implements OrderPlaceSubscriber{
    InventoryService(){
        Flipkart flipkart =Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("Inventory notify");
    }
}
