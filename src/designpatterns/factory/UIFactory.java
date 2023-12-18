package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
