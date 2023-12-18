package designpatterns.facade;
/*
The main objective of facade to move the all the clustered code to some other place atleast to make the main class look beatiful
facade - outer cover of building
ex: - if we have more jung in front of building , then we move the jung to some other place
 */
public class AmazonOrderPlaced {
    AmazonFacadeOrderPlaced amazonFacadeOrderPlaced = new AmazonFacadeOrderPlaced();
    /*
    The chunk of code is moved to facade class
     */
    boolean placeOrder(){
        return amazonFacadeOrderPlaced.placeOrder();
    }
}
