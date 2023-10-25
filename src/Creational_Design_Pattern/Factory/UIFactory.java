package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.Components.Button.Button;
import Creational_Design_Pattern.Factory.Components.DropDown.DropDown;
import Creational_Design_Pattern.Factory.Components.Menu.Menu;


public interface UIFactory { // Abstract Factory Interface - Collection of Abstract Factory Methods
    Menu createMenu(); // Abstract Factory Method
    DropDown createDropDown(); // Abstract Factory Method
    Button createButton(); // Abstract Factory Method
}
