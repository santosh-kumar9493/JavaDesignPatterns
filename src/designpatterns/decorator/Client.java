package designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateCone(new StrawberryScoope(new OrangeScoope(new ChocolateCone())));
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getPrice());
    }
}
