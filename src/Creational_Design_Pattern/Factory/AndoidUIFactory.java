package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Button.AndroidButton;
import Creational_Design_Pattern.Factory.Components.Button.Button;
import Creational_Design_Pattern.Factory.Components.DropDown.AndroidDropDown;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.Menu.AndroidMenu;
import Creational_Design_Pattern.Factory.Components.Menu.Menu;

public class AndoidUIFactory implements UIFactory{
    @Override
    public Menu createMenu() { // Factory Method for Creating Menu Object
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() { // Factory Method for Creating DropDown Object
        return new AndroidDropDown();
    }

    @Override
    public Button createButton() { // Factory Method for Creating Button Object
        return new AndroidButton();
    }
}
