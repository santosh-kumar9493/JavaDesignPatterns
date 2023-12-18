package designpatterns.decorator;

public class VanillaCone implements IceCream{

    IceCream iceCream;
    VanillaCone(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public String getDescription() {
        if(this.iceCream!=null){
            return this.iceCream.getDescription()+" VanillaCone ";
        }
        return " VanillaCone ";
    }

    @Override
    public int getPrice() {
        if(this.iceCream!=null){
            return this.iceCream.getPrice()+30;
        }
        return 30;
    }
}
