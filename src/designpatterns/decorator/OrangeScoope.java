package designpatterns.decorator;

public class OrangeScoope implements IceCream{
    IceCream iceCream;
    OrangeScoope(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public String getDescription() {
        if(this.iceCream!=null){
            return this.iceCream.getDescription()+" OrangeScoope ";
        }
        return " OrangeScoope ";
    }

    @Override
    public int getPrice() {
        if(this.iceCream!=null)
            return this.iceCream.getPrice()+50;
        return 50;
    }
}
