package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Button.Button;
import Creational_Design_Pattern.Factory.Components.Button.WindowsButton;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.DropDown.WindowsDropDown;
import Creational_Design_Pattern.Factory.Components.Menu.Menu;
import Creational_Design_Pattern.Factory.Components.Menu.WindowsMenu;

// Step6: Create respective Classes which has the Factory Methods responsible for creating respective objects
public class WindowsUIFactory implements UIFactory{
    @Override
    public Menu createMenu() { // Factory Method for Creating Menu Object
        System.out.println("Created Menu for Windows App");
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() { // Factory Method for Creating DropDown Object
        System.out.println("Created DropDown for Windows App");
        return new WindowsDropDown();
    }

    @Override
    public Button createButton() { // Factory Method for Creating Button Object
        System.out.println("Created Button for Windows App");
        return new WindowsButton();
    }
}
