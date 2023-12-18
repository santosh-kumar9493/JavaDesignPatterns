package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiAndriodFactory = flutter.createFactory(SupportedSystems.ANDRIOD);

        Button andriodButton = uiAndriodFactory.createButton();
        andriodButton.showButton();
        Menu andriodMenu = uiAndriodFactory.createMenu();
        andriodMenu.showMenu();
    }
}
