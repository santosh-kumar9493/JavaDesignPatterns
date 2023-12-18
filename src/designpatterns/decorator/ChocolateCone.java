package designpatterns.decorator;

public class ChocolateCone implements  IceCream{
    IceCream iceCream;
    ChocolateCone(){}
    ChocolateCone(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public String getDescription() {
        if(this.iceCream!=null)
            return this.iceCream.getDescription()+" Chocolate IceCream ";
        return " Chocolate IceCream ";

    }

    @Override
    public int getPrice() {
        if(this.iceCream!=null)
            return this.iceCream.getPrice()+10;
        return 10;
    }
}
