package designpatterns.decorator;

public class StrawberryScoope implements IceCream{
    IceCream iceCream;
    StrawberryScoope(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public String getDescription() {
        if(this.iceCream!=null){
            return this.iceCream.getDescription()+" StrawberryScoope ";
        }
        return " StrawberryScoope ";
    }

    @Override
    public int getPrice() {
        if(this.iceCream!=null)
            return this.iceCream.getPrice()+40;
        return 40;
    }
}
