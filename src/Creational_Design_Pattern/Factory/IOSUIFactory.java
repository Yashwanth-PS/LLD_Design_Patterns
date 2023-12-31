package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Button.Button;
import Creational_Design_Pattern.Factory.Components.Button.IOSButton;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.DropDown.IOSDropDown;
import Creational_Design_Pattern.Factory.Components.Menu.IOSMenu;
import Creational_Design_Pattern.Factory.Components.Menu.Menu;

// Step6: Create respective Classes which has the Factory Methods responsible for creating respective objects
public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() { // Factory Method for Creating Menu Object
        System.out.println("Created Menu for IOS App");
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() { // Factory Method for Creating DropDown Object
        System.out.println("Created DropDown for IOS App");
        return new IOSDropDown();
    }

    @Override
    public Button createButton() { // Factory Method for Creating Button Object
        System.out.println("Created Button for IOS App");
        return new IOSButton();
    }
}
