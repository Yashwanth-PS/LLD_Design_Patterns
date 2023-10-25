package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Button.AndroidButton;
import Creational_Design_Pattern.Factory.Components.Button.Button;
import Creational_Design_Pattern.Factory.Components.DropDown.AndroidDropDown;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.Menu.AndroidMenu;
import Creational_Design_Pattern.Factory.Components.Menu.Menu;

// Step6: Create respective Classes which has the Factory Methods responsible for creating respective objects
public class AndroidUIFactory implements UIFactory{
    @Override
    public Menu createMenu() { // Factory Method for Creating Menu Object
        System.out.println("Created Menu for Android App");
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() { // Factory Method for Creating DropDown Object
        System.out.println("Created DropDown for Android App");
        return new AndroidDropDown();
    }

    @Override
    public Button createButton() { // Factory Method for Creating Button Object
        System.out.println("Created Button for Android App");
        return new AndroidButton();
    }
}
