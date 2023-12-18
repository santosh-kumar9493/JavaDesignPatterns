package designpatterns.factory;

public class Flutter {
    void refreshUI(){
        System.out.println("refresh UI");
    }
    void setTheme(){
        System.out.println("set theme");
    }
    UIFactory createFactory(SupportedSystems platform){
        // too many if-else voilate OCP
        return UIFactoryHelper.getFactory(platform);
    }
}
