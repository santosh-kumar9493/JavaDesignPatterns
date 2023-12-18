package designpatterns.factory;

public class UIFactoryHelper {
    public static UIFactory getFactory(SupportedSystems platform){
        if(platform.equals(SupportedSystems.IOS)){
            return new IosUIFactory();
        }
        else{
            return new AndriodUIFactory();
        }
    }
}
