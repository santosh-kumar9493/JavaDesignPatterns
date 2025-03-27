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

/*
This is example of abstract factory which is factory of factory.

First let us understand what is factory and why we need factory?

Factory -> This is similar to real world factory that helps us creating objects

Why we need factory?
Let’s say you are building a game where there are different types of characters like knights,
 archers, and wizards. Instead of directly creating each character every time you need one 
 (which could lead to messy code), you use a factory. You tell the factory, "I need a character,"
  and the factory decides whether to create a knight, archer, or wizard based on certain
   conditions


Abstract factory?
Similar to factory, in the above example , AndriodFactory and IOSFactory are used based on condition,
we will have FactoryHelper which helps in getting the type of factory we want.

*/