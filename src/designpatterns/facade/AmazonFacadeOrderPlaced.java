package designpatterns.facade;

public class AmazonFacadeOrderPlaced {
    /*
        All these chunk of code is moved from AmazonOrderPlaced class to this class
        to make the main class look beautiful
     */
    // NotificationService notificationService = new NotificationService();
    // InventoryService inventoryService = new InventoryService();
    // LogisticService logisticeService = new LogisticService();
    boolean placeOrder(){
        // inventoryService.updateInventory();
        // notificationService.notify();
        // logisticeService.makeLogistic();
        return false;
    }
}
