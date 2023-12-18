package designpatterns.decorator;

public class ChocoChips implements IceCream{
    IceCream iceCream;
    ChocoChips(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public String getDescription() {
        if(this.iceCream!=null){
            return this.iceCream.getDescription()+" ChocoChips ";
        }
        return " ChocoChips ";
    }

    @Override
    public int getPrice() {
        if(this.iceCream!=null){
            return this.iceCream.getPrice()+20;
        }
        return 20;
    }
}
