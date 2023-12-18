package designpatterns.factory;

import designpatterns.factory.components.AndriodButton;
import designpatterns.factory.components.AndriodMenu;
import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public class AndriodUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }
}
